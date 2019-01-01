package com.nagesagi.troper.parser;

import com.nagesagi.troper.models.Article;

import org.jsoup.nodes.Document;

public interface ArticleParser {
    Document parse(Document data) throws Exception;
}