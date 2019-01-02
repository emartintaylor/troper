package com.nagesagi.troper.dataaccessor;

import com.nagesagi.troper.models.Article;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class WebsiteArticleAccessor implements ArticleAccessor {

    private String _url;

    public WebsiteArticleAccessor(String url){
        _url = url;
    }

    @Override
    public Document access() {
        try {
            return Jsoup.connect(_url).userAgent("Mozilla").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Document("https://www.google.com/");
    }
}
