package com.nagesagi.troper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.nagesagi.troper.processor.AsyncProcessor;

public class MainActivity extends DefaultMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = findViewById(R.id.contentText);
        webView.loadData("<html><body><h1>Main pagesLoading content</h1></body></html>",  "text/html", "iso-8859-1");

        /*Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights"));

        startActivity(intent);*/
    }
}
