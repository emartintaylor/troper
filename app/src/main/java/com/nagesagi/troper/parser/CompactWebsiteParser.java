package com.nagesagi.troper.parser;

import android.util.Log;

import com.nagesagi.troper.models.Article;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CompactWebsiteParser extends WebsiteArticleParser {
    @Override
    public Document parse(Document document){
        document = super.parse(document);

        // remove specific attributes
        document.getElementsByAttribute("title").removeAttr("title");

        return document;
    }
}
