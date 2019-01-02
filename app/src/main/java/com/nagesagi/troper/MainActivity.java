package com.nagesagi.troper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.nagesagi.troper.processor.AsyncProcessor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        WebView textbox = findViewById(R.id.contentText);
        textbox.getSettings().setJavaScriptEnabled(true);
        textbox.loadData("<html><body><h1>Loading content</h1></body></html>",  "text/html", "iso-8859-1");
        String uri = "http://tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights";

        new AsyncProcessor(article -> {
            textbox.loadData(article.getFormattedHtml().html(),  "text/html", "iso-8859-1");
        }).execute(uri);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
