package com.nagesagi.troper.dataaccessor;

import com.nagesagi.troper.models.Article;

import org.junit.Test;

public class WebsiteFetcherTest {
    @Test
    public void CanFetchHtmlTest() throws Exception {
        WebsiteArticleAccessor fetcher = new WebsiteArticleAccessor();
        Article article = fetcher.access("https://tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights");
    }
}
