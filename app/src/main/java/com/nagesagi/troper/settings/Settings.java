package com.nagesagi.troper.settings;

public class Settings implements ArticleFetcherSettings {

    private boolean _showSpoilers, _allowCaching, _highlightSpilers;

    public Settings(){
        _showSpoilers = false;
        _allowCaching = false;
        _highlightSpilers = false;
    }
    @Override
    public boolean AllowCaching() {
        return _allowCaching;
    }

    @Override
    public boolean ShowSpoilers() {
        return _showSpoilers;
    }

    @Override
    public boolean HighlightSpilers() {
        return _highlightSpilers;
    }
}