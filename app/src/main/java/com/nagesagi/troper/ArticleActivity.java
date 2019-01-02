package com.nagesagi.troper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

import com.nagesagi.troper.processor.AsyncProcessor;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String uri = intent.getStringExtra("url");

        WebView webView = findViewById(R.id.articleContentText);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData("<html><body><h1>Loading content</h1></body></html>",  "text/html", "iso-8859-1");

        new AsyncProcessor(article -> {
            webView.loadData(article.getFormattedHtml().html(),  "text/html", "iso-8859-1");
        }).execute(uri);
    }

}
