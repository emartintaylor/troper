package com.nagesagi.troper;

import android.webkit.WebView;

import com.nagesagi.troper.dataaccessor.WebsiteArticleAccessor;
import com.nagesagi.troper.parser.WebsiteArticleParser;
import com.nagesagi.troper.processor.AsyncProcessor;
import com.nagesagi.troper.processor.Processor;

public class ProcessorFactory {

    public static Processor getProcessor(String url, WebView webView){

        return  new AsyncProcessor(
                new WebsiteArticleAccessor(url),
                new WebsiteArticleParser(),
                article -> {
                    webView.loadData(article.getFormattedHtml().html(),  "text/html", "iso-8859-1");
                });
    }
}
