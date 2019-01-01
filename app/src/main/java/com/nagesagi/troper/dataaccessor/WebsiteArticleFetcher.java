package com.nagesagi.troper.dataaccessor;

import com.nagesagi.troper.models.Article;

import org.jsoup.nodes.Document;

public class WebsiteArticleFetcher {

    public Document access(String uri) {
        Article article = new Article(uri);
        new AsyncWebDataAccessor(webpage -> article.setRawHtml(webpage)).execute(uri);
        return article.getRawHtml();
    }
}
