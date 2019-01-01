package com.nagesagi.troper.dataaccessor;

import com.nagesagi.troper.models.Article;
import com.nagesagi.troper.parser.WebsiteArticleParser;

import org.junit.Test;

public class WebsiteFetcherTest {
    @Test
    public void CanFetchHtmlTest() throws Exception {
        WebsiteArticleFetcher fetcher = new WebsiteArticleFetcher();
        Article article = fetcher.access("https://tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights");
    }
}
