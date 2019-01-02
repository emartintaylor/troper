package com.nagesagi.troper.processor;

import android.os.AsyncTask;

import com.nagesagi.troper.dataaccessor.ArticleAccessor;
import com.nagesagi.troper.dataaccessor.WebsiteArticleAccessor;
import com.nagesagi.troper.models.Article;
import com.nagesagi.troper.parser.ArticleParser;
import com.nagesagi.troper.parser.WebsiteArticleParser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.function.Consumer;

public class AsyncProcessor extends AsyncTask<String, Void, Article> {

    Consumer<Article> _callback;

    public AsyncProcessor(Consumer<Article> callback){
        _callback = callback;
    }

    @Override
    public Article doInBackground(String... urls) {
        String url = urls[0];
        ArticleAccessor accessor = new WebsiteArticleAccessor(url);
        Article article = new Article(url);
        article.setRawHtml(accessor.access());

        ArticleParser parser = new WebsiteArticleParser();
        article.setFormattedHtml(parser.parse(article.getRawHtml()));
        return article;
    }

    @Override
    protected void onPostExecute(Article article){
        _callback.accept(article);
    }
}
