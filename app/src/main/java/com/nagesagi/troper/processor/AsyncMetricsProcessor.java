package com.nagesagi.troper.processor;

import android.util.Log;

import com.nagesagi.troper.dataaccessor.ArticleAccessor;
import com.nagesagi.troper.models.Article;
import com.nagesagi.troper.parser.ArticleParser;

import java.util.function.Consumer;

public class AsyncMetricsProcessor extends Processor {

    ArticleAccessor _accessor;
    ArticleParser _parser;
    Consumer<Article> _callback;

    public AsyncMetricsProcessor(ArticleAccessor accessor, ArticleParser parser, Consumer<Article> callback){
        _callback = callback;
        _accessor = accessor;
        _parser = parser;
    }

    String tag = "TroperMetric";
    @Override
    public Article doInBackground(String... urls) {
        Log.d(tag,"Before Start");
        long start = System.currentTimeMillis();
        String url = urls[0];
        Article article = new Article(url);
        long beforeAccessor = System.currentTimeMillis();
        Log.d(tag, "Before accessor: "+(beforeAccessor-start));
        article.setRawHtml(_accessor.access());
        long afterAccessor = System.currentTimeMillis();
        Log.d(tag,"After accessor: "+(afterAccessor-beforeAccessor));

        article.setFormattedHtml(_parser.parse(article.getRawHtml()));
        long afterParser = System.currentTimeMillis();
        Log.d(tag,"After parser: "+(afterParser-afterAccessor));

        longLog("FormattedMessage",article.getFormattedHtml().html());
        return article;

    }

    private void longLog(String tag, String message) {
        int maxLogSize = 1000;
        for (int i = 0; i <= message.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i + 1) * maxLogSize;
            end = end > message.length() ? message.length() : end;
            Log.v(tag, message.substring(start, end));
        }
    }

    @Override
    protected void onPostExecute(Article article){
        _callback.accept(article);
    }
}
