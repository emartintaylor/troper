package com.nagesagi.troper.processor;

import android.os.AsyncTask;

import com.nagesagi.troper.dataaccessor.ArticleAccessor;
import com.nagesagi.troper.models.Article;
import com.nagesagi.troper.parser.ArticleParser;
import java.util.function.Consumer;

public class AsyncProcessor extends Processor {

    ArticleAccessor _accessor;
    ArticleParser _parser;
    Consumer<Article> _callback;

    public AsyncProcessor(ArticleAccessor accessor, ArticleParser parser, Consumer<Article> callback){
        _callback = callback;
        _accessor = accessor;
        _parser = parser;
    }

    @Override
    public Article doInBackground(String... urls) {
        String url = urls[0];
        Article article = new Article(url);
        article.setRawHtml(_accessor.access());
        article.setFormattedHtml(_parser.parse(article.getRawHtml()));
        return article;
    }

    @Override
    protected void onPostExecute(Article article){
        _callback.accept(article);
    }
}
