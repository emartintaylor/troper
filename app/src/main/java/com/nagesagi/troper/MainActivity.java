package com.nagesagi.troper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import com.nagesagi.troper.dataaccessor.AsyncWebDataAccessor;
import com.nagesagi.troper.dataaccessor.WebsiteArticleFetcher;
import com.nagesagi.troper.models.Article;
import com.nagesagi.troper.parser.ArticleParser;
import com.nagesagi.troper.parser.WebsiteArticleParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        WebView textbox = findViewById(R.id.contentText);
        textbox.getSettings().setJavaScriptEnabled(true);
        textbox.loadData("<html><body><h1>Loading content</h1></body></html>",  "text/html", "iso-8859-1");
        String uri = "http://tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights";

        final Article article = new Article(uri);
        new AsyncWebDataAccessor(webpage -> {
            ArticleParser parser = new WebsiteArticleParser();
            try {
                article.setRawHtml(webpage);
                article.setFormattedHtml(parser.parse(article.getRawHtml()));

            } catch (Exception e) {
                e.printStackTrace();
            }
            textbox.loadData(article.getFormattedHtml().html(),  "text/html", "iso-8859-1");
        }).execute(uri);
        //WebsiteArticleFetcher fetcher = new WebsiteArticleFetcher();
        //Article article = fetcher.access(uri);
//        ArticleParser parser = new WebsiteArticleParser();
//        try {
//            article.setFormattedHtml(parser.parse(article.getRawHtml()));
//            textbox.setText(Html.fromHtml(article.getFormattedHtml().html(), Html.FROM_HTML_MODE_COMPACT));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void longMessage(String tag, String message){
        int maxLogSize = 1000;
        for(int i = 0; i <= message.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i+1) * maxLogSize;
            end = end > message.length() ? message.length() : end;
            Log.d(tag, message.substring(start, end));
        }
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
