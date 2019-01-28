package com.nagesagi.troper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

import com.nagesagi.troper.processor.AsyncProcessor;

public class ArticleActivity extends DefaultMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String url = intent.getData().toString();

        WebView webView = findViewById(R.id.articleContentText);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData("<html><body><h1>Loading content</h1></body></html>",  "text/html", "iso-8859-1");

        ProcessorFactory.getProcessorWithMetrics(url, webView, this).execute(url);
    }
}
