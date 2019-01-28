package com.nagesagi.troper;

import android.app.Activity;
import android.webkit.WebView;

import com.nagesagi.troper.dataaccessor.WebsiteArticleAccessor;
import com.nagesagi.troper.parser.CompactWebsiteParser;
import com.nagesagi.troper.parser.WebsiteArticleParser;
import com.nagesagi.troper.processor.AsyncMetricsProcessor;
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

    public static Processor getProcessorWithMetrics(String url, WebView webView, Activity activity){

        return  new AsyncMetricsProcessor(
                new WebsiteArticleAccessor(url),
                new CompactWebsiteParser(),
                article -> {
                    activity.setTitle(article.getName());
                    webView.loadData(article.getFormattedHtml().html(),  "text/html", "iso-8859-1");
                });
    }
}
