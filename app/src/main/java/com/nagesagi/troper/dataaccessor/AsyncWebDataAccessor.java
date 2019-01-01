package com.nagesagi.troper.dataaccessor;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.function.Consumer;

public class AsyncWebDataAccessor extends AsyncTask<String, Void, Document> {

    Consumer<Document> _callback;

    public AsyncWebDataAccessor(Consumer<Document> callback){
        _callback = callback;
    }

    @Override
    public Document doInBackground(String... urls) {
        String url = urls[0];
        try {
            return Jsoup.connect(url).userAgent("Mozilla").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Document("https://www.google.com/");
    }

    @Override
    protected void onPostExecute(Document webpage){
        _callback.accept(webpage);
    }
}
