package com.nagesagi.troper.models;

import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for articles, containing Name, URL, and additional info
 */
public class Article
{
    private String _name;
    private String _url;
    private Document _formatted;
    private Document _raw;

    public Article(){
    }

    public Article(String name){
        this();
        _name = name;
    }

    public Article(String name, String url)
    {
        this(name);
        _url = url;
    }
    public Article(String name, String url, Document html)
    {
        this(name, url);
        _formatted = html;
        _raw = html;
    }

    public String getName()
    {
        return _name;
    }
    public String getUrl()
    {
        return _url;
    }
    public String toString()
    {
        return _name;
    }
    public void setName(String name)
    {
        _name = name;
    }
    public void setUrl(String url)
    {
        _url = url;
    }


    public Document getFormattedHtml()
    {
        return _formatted;
    }
    public void setFormattedHtml(Document formatted){ _formatted = formatted; }

    public Document getRawHtml() { return _raw; }
    public void setRawHtml(Document originalHtml) {_raw = originalHtml; }
}