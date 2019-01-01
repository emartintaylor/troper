package com.nagesagi.troper.parser;

import com.nagesagi.troper.models.Article;

import org.junit.Test;

public class ParserTest {
    @Test
    public void CanParseHtmlTest() throws Exception {
        WebsiteArticleParser parser = new WebsiteArticleParser();
        Article article = new Article();
        article.setRawHtml(html);
        article = parser.parse(article);
    }

    String html ="\n" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head lang=\"en\">\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n" +
            "<title>Not Wearing Tights - TV Tropes</title>\n" +
            "<meta name=\"description\" content=\"The Not Wearing Tights trope as used in popular culture. These superheroes just aren't called superheroes. They often don't wear costumes or use code names, &hellip;\" />\n" +
            "<link rel=\"shortcut icon\" href=\"https://static.tvtropes.org/img/icons/favicon.ico\" type=\"image/x-icon\" />\n" +
            "<meta name=\"twitter:card\" content=\"summary_large_image\" />\n" +
            "<meta name=\"twitter:site\" content=\"@tvtropes\" />\n" +
            "<meta name=\"twitter:owner\" content=\"@tvtropes\" />\n" +
            "<meta name=\"twitter:title\" content=\"Not Wearing Tights - TV Tropes\" />\n" +
            "<meta name=\"twitter:description\" content=\"The Not Wearing Tights trope as used in popular culture. These superheroes just aren't called superheroes. They often don't wear costumes or use code names, &hellip;\" />\n" +
            "<meta name=\"twitter:image:src\" content=\"https://static.tvtropes.org/pmwiki/pub/images/wolverine_9727.png\" />\n" +
            "<meta property=\"og:site_name\" content=\"TV Tropes\" />\n" +
            "<meta property=\"og:locale\" content=\"en_US\" />\n" +
            "<meta property=\"article:publisher\" content=\"https://www.facebook.com/tvtropes\" />\n" +
            "<meta property=\"og:title\" content=\"Not Wearing Tights - TV Tropes\" />\n" +
            "<meta property=\"og:type\" content=\"website\" />\n" +
            "<meta property=\"og:url\" content=\"https://tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights\" />\n" +
            "<meta property=\"og:image\" content=\"https://static.tvtropes.org/pmwiki/pub/images/wolverine_9727.png\" />\n" +
            "<meta property=\"og:description\" content=\"These superheroes just aren't called superheroes. They often don't wear costumes or use code names, but they have abilities far beyond those of normal men, and are superheroes in all but name. Occasionally, such stories will lampshade the trope &hellip;\" />\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"https://static.tvtropes.org/img/icons/apple-icon-57x57.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"https://static.tvtropes.org/img/icons/apple-icon-60x60.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://static.tvtropes.org/img/icons/apple-icon-72x72.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"https://static.tvtropes.org/img/icons/apple-icon-76x76.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://static.tvtropes.org/img/icons/apple-icon-114x114.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"https://static.tvtropes.org/img/icons/apple-icon-120x120.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://static.tvtropes.org/img/icons/apple-icon-144x144.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"https://static.tvtropes.org/img/icons/apple-icon-152x152.png\" type=\"image/png\">\n" +
            "<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"https://static.tvtropes.org/img/icons/apple-icon-180x180.png\" type=\"image/png\">\n" +
            "<link rel=\"icon\" sizes=\"16x16\" href=\"https://static.tvtropes.org/img/icons/favicon-16x16.png\" type=\"image/png\">\n" +
            "<link rel=\"icon\" sizes=\"32x32\" href=\"https://static.tvtropes.org/img/icons/favicon-32x32.png\" type=\"image/png\">\n" +
            "<link rel=\"icon\" sizes=\"96x96\" href=\"https://static.tvtropes.org/img/icons/favicon-96x96.png\" type=\"image/png\">\n" +
            "<link rel=\"icon\" sizes=\"192x192\" href=\"https://static.tvtropes.org/img/icons/favicon-192x192.png\" type=\"image/png\">\n" +
            "<meta id=\"viewport\" name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
            "<script>\n" +
            "                var propertag = {};\n" +
            "                propertag.cmd = [];\n" +
            "            </script>\n" +
            " <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
            "<link rel=\"stylesheet\" href=\"https://static.tvtropes.org/design/assets/bundle.css?rev=232\" />\n" +
            "<script>\n" +
            "                function object(objectId) {\n" +
            "                    if (document.getElementById && document.getElementById(objectId)) {\n" +
            "                        return document.getElementById(objectId);\n" +
            "                    } else if (document.all && document.all(objectId)) {\n" +
            "                        return document.all(objectId);\n" +
            "                    } else if (document.layers && document.layers[objectId]) {\n" +
            "                        return document.layers[objectId];\n" +
            "                    } else {\n" +
            "                        return false;\n" +
            "                    }\n" +
            "                }\n" +
            "\n" +
            "                // JAVASCRIPT COOKIES CODE: for getting and setting user viewing preferences\n" +
            "                var cookies = {\n" +
            "                    create: function (name, value, days2expire, path) {\n" +
            "                        var date = new Date();\n" +
            "                        date.setTime(date.getTime() + (days2expire * 24 * 60 * 60 * 1000));\n" +
            "                        var expires = date.toUTCString();\n" +
            "                        document.cookie = name + '=' + value + ';' + 'expires=' + expires + ';' + 'path=' + path + ';';\n" +
            "                    },\n" +
            "                    read: function (name) {\n" +
            "                        var cookie_value = \"\",\n" +
            "                            current_cookie = \"\",\n" +
            "                            name_expr = name + \"=\",\n" +
            "                            all_cookies = document.cookie.split(';'),\n" +
            "                            n = all_cookies.length;\n" +
            "\n" +
            "                        for (var i = 0; i < n; i++) {\n" +
            "                            current_cookie = all_cookies[i].trim();\n" +
            "                            if (current_cookie.indexOf(name_expr) === 0) {\n" +
            "                                cookie_value = current_cookie.substring(name_expr.length, current_cookie.length);\n" +
            "                                break;\n" +
            "                            }\n" +
            "                        }\n" +
            "                        return cookie_value;\n" +
            "                    },\n" +
            "                    update: function (name, val) {\n" +
            "                        this.create(name, val, 300, \"/\");\n" +
            "                    },\n" +
            "                    remove: function (name) {\n" +
            "                        document.cookie = name + \"=; expires=Thu, 01 Jan 1970 00:00:00 GMT; path=/\";\n" +
            "                    }\n" +
            "                };\n" +
            "\n" +
            "                function updateUserPrefs() {\n" +
            "                    //GENERAL: detect and set browser, if not cookied (will be treated like a user-preference and added to the #user-pref element)\n" +
            "                    if( !cookies.read('user-browser') ){\n" +
            "                        var broswer = '';\n" +
            "\n" +
            "                        if(navigator.userAgent.match(/iPhone/i) || navigator.userAgent.match(/iPod/i) ){\n" +
            "                            browser = 'iOS';\n" +
            "                        } else if (/Opera[\\/\\s](\\d+\\.\\d+)/.test(navigator.userAgent)) {\n" +
            "                            browser = 'opera';\n" +
            "                        } else if (/MSIE (\\d+\\.\\d+);/.test(navigator.userAgent)) {\n" +
            "                            browser = 'MSIE';\n" +
            "                        } else if (/Navigator[\\/\\s](\\d+\\.\\d+)/.test(navigator.userAgent)) {\n" +
            "                            browser = 'netscape';\n" +
            "                        } else if (/Chrome[\\/\\s](\\d+\\.\\d+)/.test(navigator.userAgent)) {\n" +
            "                            browser = 'chrome';\n" +
            "                        } else if (/Safari[\\/\\s](\\d+\\.\\d+)/.test(navigator.userAgent)) {\n" +
            "                            browser = 'safari';\n" +
            "                            /Version[\\/\\s](\\d+\\.\\d+)/.test(navigator.userAgent);\n" +
            "                            browserVersion = new Number(RegExp.$1);\n" +
            "                        } else if (/Firefox[\\/\\s](\\d+\\.\\d+)/.test(navigator.userAgent)) {\n" +
            "                            browser = 'firefox';\n" +
            "                        }\n" +
            "                        cookies.create('user-browser',browser,1,'/');\n" +
            "                        document.getElementById('user-prefs').classList.add('browser-' + browser);\n" +
            "                    } else {\n" +
            "                        document.getElementById('user-prefs').classList.add('browser-' + cookies.read('user-browser'));\n" +
            "                    }\n" +
            "\n" +
            "                    //update user preference settings\n" +
            "                    if (cookies.read('wide-load') !== '') document.getElementById('user-prefs').classList.add('wide-load');\n" +
            "                    if (cookies.read('night-vision') !== '') document.getElementById('user-prefs').classList.add('night-vision');\n" +
            "                    if (cookies.read('sticky-header') !== '') document.getElementById('user-prefs').classList.add('sticky-header');\n" +
            "                    if (cookies.read('show-spoilers') !== '') document.getElementById('user-prefs').classList.add('show-spoilers');\n" +
            "                    if (cookies.read('folders-open') !== '') document.getElementById('user-prefs').classList.add('folders-open');\n" +
            "                    if (cookies.read('lefthand-sidebar') !== '') document.getElementById('user-prefs').classList.add('lefthand-sidebar');\n" +
            "                    if (cookies.read('highlight-links') !== '') document.getElementById('user-prefs').classList.add('highlight-links');\n" +
            "                    if (cookies.read('forum-gingerbread') !== '') document.getElementById('user-prefs').classList.add('forum-gingerbread');\n" +
            "                    if (cookies.read('shared-avatars') !== '') document.getElementById('user-prefs').classList.add('shared-avatars');\n" +
            "\n" +
            "                    //desktop view on mobile\n" +
            "                    if (cookies.read('desktop-on-mobile') !== ''){\n" +
            "                        document.getElementById('user-prefs').classList.add('desktop-on-mobile');\n" +
            "\n" +
            "                        var viewport = document.querySelector(\"meta[name=viewport]\");\n" +
            "                        viewport.setAttribute('content', 'width=1000');\n" +
            "                    }\n" +
            "\n" +
            "                }\n" +
            "\n" +
            "                function updateDesktopPrefs() {\n" +
            "                    if (cookies.read('wide-load') !== '') document.getElementById('sidebar-toggle-wideload').classList.add('active');\n" +
            "                    if (cookies.read('night-vision') !== '') document.getElementById('sidebar-toggle-nightvision').classList.add('active');\n" +
            "                    if (cookies.read('sticky-header') !== '') document.getElementById('sidebar-toggle-stickyheader').classList.add('active');\n" +
            "                    if (cookies.read('show-spoilers') !== '') document.getElementById('sidebar-toggle-showspoilers').classList.add('active');\n" +
            "\n" +
            "                }\n" +
            "\n" +
            "                function updateMobilePrefs() {\n" +
            "                    if (cookies.read('show-spoilers') !== '') document.getElementById('mobile-toggle-showspoilers').classList.add('active');\n" +
            "                    if (cookies.read('night-vision') !== '') document.getElementById('mobile-toggle-nightvision').classList.add('active');\n" +
            "                    if (cookies.read('sticky-header') !== '') document.getElementById('mobile-toggle-stickyheader').classList.add('active');\n" +
            "                    if (cookies.read('highlight-links') !== '') document.getElementById('mobile-toggle-highlightlinks').classList.add('active');\n" +
            "\n" +
            "                }\n" +
            "\n" +
            "            </script>\n" +
            "</head>\n" +
            "<body class=\"\">\n" +
            "<i id=\"user-prefs\"></i>\n" +
            "<script>updateUserPrefs();</script>\n" +
            "<div id=\"fb-root\"></div>\n" +
            "<div id=\"modal-box\"></div>\n" +
            "<header id=\"main-header-bar\" class=\"headroom-element \">\n" +
            "<div id=\"main-header-bar-inner\">\n" +
            "<span id=\"header-spacer-left\" class=\"header-spacer\"></span>\n" +
            "<a href=\"#mobile-menu\" id=\"main-mobile-toggle\" class=\"mobile-menu-toggle-button tablet-on\"><span></span><span></span><span></span></a>\n" +
            "<a href=\"/\" id=\"main-header-logoButton\" class=\"no-dev\"></a>\n" +
            "<span id=\"header-spacer-right\" class=\"header-spacer\"></span>\n" +
            "<nav id=\"main-header-nav\" class=\"tablet-off\">\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/Tropes\">Tropes</a>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/Media\">Media</a>\n" +
            "<a href=\"/pmwiki/browse.php\" class=\"nav-browse\">Browse</a>\n" +
            "<a href=\"/pmwiki/index_report.php\">Indexes</a>\n" +
            "<a href=\"/pmwiki/topics.php\">Forums</a>\n" +
            "</nav>\n" +
            "<div id=\"main-header-bar-right\">\n" +
            "<div id=\"signup-login-box\" class=\"font-xs mobile-off\">\n" +
            "<a href=\"/pmwiki/login.php\" class=\"hover-underline bold\" data-modal-target=\"signup\">Join</a>\n" +
            "<a href=\"/pmwiki/login.php\" class=\"hover-underline bold\" data-modal-target=\"login\">Login</a>\n" +
            "</div>\n" +
            "<div id=\"signup-login-mobileToggle\" class=\"mobile-on inline\">\n" +
            "<a href=\"/pmwiki/login.php\" data-modal-target=\"login\"><i class=\"fa fa-user\"></i></a>\n" +
            "</div>\n" +
            "<div id=\"search-box\">\n" +
            "<form class=\"search\" action=\"/pmwiki/search_result.php\">\n" +
            "<input type=\"text\" name=\"q\" class=\"search-box\" placeholder=\"Search\" value=\"\" required>\n" +
            "<input type=\"submit\" class=\"submit-button\" value=\"&#xf002;\" />\n" +
            "<input type=\"hidden\" name=\"search_type\" value=\"article\">\n" +
            "<input type=\"hidden\" name=\"page_type\" value=\"all\">\n" +
            "<input type=\"hidden\" name=\"cx\" value=\"partner-pub-6610802604051523:amzitfn8e7v\">\n" +
            "<input type=\"hidden\" name=\"cof\" value=\"FORID:10\">\n" +
            "<input type=\"hidden\" name=\"ie\" value=\"ISO-8859-1\">\n" +
            "<input name=\"siteurl\" type=\"hidden\" value=\"\">\n" +
            "<input name=\"ref\" type=\"hidden\" value=\"\">\n" +
            "<input name=\"ss\" type=\"hidden\" value=\"\">\n" +
            "</form>\n" +
            "<a href=\"#close-search\" class=\"mobile-on mobile-search-toggle close-x\"><i class=\"fa fa-close\"></i></a>\n" +
            "</div>\n" +
            "<div id=\"random-box\">\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/InformedDeformity\" class=\"button-random-trope\" rel=\"nofollow\" onclick=\"ga('send', 'event', 'button', 'click', 'random trope');\"></a>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Film/Alligator\" class=\"button-random-media\" rel=\"nofollow\" onclick=\"ga('send', 'event', 'button', 'click', 'random media');\"></a>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"mobile-menu\" class=\"tablet-on\"><div class=\"mobile-menu-options\">\n" +
            "<div class=\"nav-wrapper\">\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/Tropes\" class=\"xl\">Tropes</a>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/Media\" class=\"xl\">Media</a>\n" +
            "<a href=\"/pmwiki/browse.php\" class=\"xl\">Browse</a>\n" +
            "<a href=\"/pmwiki/index_report.php\" class=\"xl\">Indexes</a>\n" +
            "<a href=\"/pmwiki/topics.php\" class=\"xl\">Forums</a>\n" +
            "<a href=\"/pmwiki/query.php?type=att\">Ask The Tropers</a>\n" +
            "<a href=\"/pmwiki/query.php?type=tf\">Trope Finder</a>\n" +
            "<a href=\"/pmwiki/query.php?type=ykts\">You Know That Show...</a>\n" +
            "<a href=\"/pmwiki/tlp_activity.php\">Trope Launch Pad</a>\n" +
            "<a href=\"#tools\" data-click-toggle=\"active\">Tools <i class=\"fa fa-chevron-down\"></i></a>\n" +
            "<div class=\"tools-dropdown mobile-dropdown-linkList\">\n" +
            "<a href=\"/pmwiki/cutlist.php\">Cut List</a>\n" +
            "<a href=\"/pmwiki/changes.php\">New Edits</a>\n" +
            "<a href=\"/pmwiki/recent_edit_reasons.php\">Edit Reasons</a>\n" +
            "<a href=\"/pmwiki/launches.php\">Launches</a>\n" +
            "<a href=\"/pmwiki/img_list.php\">Images List</a>\n" +
            "<a href=\"/pmwiki/crown_activity.php\">Crowner Activity</a>\n" +
            "<a href=\"/pmwiki/no_types.php\">Un-typed Pages</a>\n" +
            "<a href=\"/pmwiki/page_type_audit.php\">Recent Page Type Changes</a>\n" +
            "</div>\n" +
            "<a href=\"#hq\" data-click-toggle=\"active\">Tropes HQ <i class=\"fa fa-chevron-down\"></i></a>\n" +
            "<div class=\"tools-dropdown mobile-dropdown-linkList\">\n" +
            "<a href=\"/pmwiki/about.php\">About Us</a>\n" +
            "<a href=\"/pmwiki/contact.php\">Contact Us</a>\n" +
            "<a href=\"mailto:advertising@proper.io\">Advertise</a>\n" +
            "</div>\n" +
            "<div class=\"toggle-switches\">\n" +
            "<ul class=\"mobile-menu display-toggles\">\n" +
            "<li>Show Spoilers <div id=\"mobile-toggle-showspoilers\" class=\"display-toggle show-spoilers\"></div></li>\n" +
            "<li>Night Vision <div id=\"mobile-toggle-nightvision\" class=\"display-toggle night-vision\"></div></li>\n" +
            "<li>Sticky Header <div id=\"mobile-toggle-stickyheader\" class=\"display-toggle sticky-header\"></div></li>\n" +
            "<li>Highlight Links <div id=\"mobile-toggle-highlightlinks\" class=\"display-toggle highlight-links\"></div></li>\n" +
            "</ul>\n" +
            "<script>updateMobilePrefs();</script>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</header>\n" +
            "<div id=\"homepage-introBox-mobile\" class=\"mobile-on\">\n" +
            "<a href=\"/\"><img src=\"https://static.tvtropes.org/images/logo-white-big.png\" class=\"logo-small\" /></a>\n" +
            "<form class=\"search\" action=\"/pmwiki/search_result.php\" style=\"margin:10px -5px -6px -5px;\">\n" +
            "<input type=\"text\" name=\"q\" class=\"search-box\" placeholder=\"Search\" value=\"\" required>\n" +
            "<input type=\"submit\" class=\"submit-button\" value=\"&#xf002;\" />\n" +
            "<input type=\"hidden\" name=\"search_type\" value=\"article\">\n" +
            "<input type=\"hidden\" name=\"page_type\" value=\"all\">\n" +
            "<input type=\"hidden\" name=\"cx\" value=\"partner-pub-6610802604051523:amzitfn8e7v\">\n" +
            "<input type=\"hidden\" name=\"cof\" value=\"FORID:10\">\n" +
            "<input type=\"hidden\" name=\"ie\" value=\"ISO-8859-1\">\n" +
            "<input name=\"siteurl\" type=\"hidden\" value=\"\">\n" +
            "<input name=\"ref\" type=\"hidden\" value=\"\">\n" +
            "<input name=\"ss\" type=\"hidden\" value=\"\">\n" +
            "</form>\n" +
            "</div>\n" +
            "<div id=\"header-ad-wrapper\" class=\"ad\">\n" +
            "<div id=\"header-ad\">\n" +
            "<div class=\"ad-size-970x90 atf_banner\">\n" +
            "<div class='proper-ad-unit '>\n" +
            "<div id='proper-ad-tvtropes_main_1'> <script>propertag.cmd.push(function() { proper_display('tvtropes_main_1'); });</script> </div>\n" +
            "</div> </div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"main-container\">\n" +
            "<div id=\"action-bar-top\" class=\"action-bar mobile-off\">\n" +
            "<div class=\"action-bar-right\">\n" +
            "<p>Follow TV Tropes</p>\n" +
            "<a href=\"https://www.facebook.com/TVTropes\" class=\"button-fb\">\n" +
            "<i class=\"fa fa-facebook\"></i></a>\n" +
            "<a href=\"https://www.twitter.com/TVTropes\" class=\"button-tw\">\n" +
            "<i class=\"fa fa-twitter\"></i></a>\n" +
            "<a href=\"https://www.reddit.com/r/TVTropes\" class=\"button-re\">\n" +
            "<i class=\"fa fa-reddit-alien\"></i></a>\n" +
            "</div>\n" +
            "<nav class=\"actions-wrapper\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\" style=\"opacity: 0\">\n" +
            "<ul class=\"page-actions ss-delay\">\n" +
            "<li class=\"link-edit\">\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NotWearingTights?action=edit\" rel=\"nofollow\" class=\"article-edit-button\" data-modal-target=\"login\">\n" +
            "<i class=\"fa fa-pencil\">\n" +
            "</i> Edit Page</a></li>\n" +
            "<li class=\"link-related\"><a href=\"/pmwiki/relatedsearch.php?term=Main/NotWearingTights\">\n" +
            "<i class=\"fa fa-share-alt\"></i> Related</a></li>\n" +
            "<li class=\"link-history\"><a href=\"/pmwiki/article_history.php?article=Main.NotWearingTights\">\n" +
            "<i class=\"fa fa-history\"></i> History</a></li>\n" +
            "<li class=\"link-discussion\"><a href=\"/pmwiki/remarks.php?trope=Main.NotWearingTights\">\n" +
            "<i class=\"fa fa-comment\"></i> Discussion</a></li>\n" +
            "<li class=\"link-todo tuck-always\"><a href=\"#todo\" data-modal-target=\"login\">\n" +
            "<i class=\"fa fa-check-circle\"></i> To Do</a></li>\n" +
            "<li class=\"link-pageSource tuck-always\"><a href=\"/pmwiki/pmwiki.php/Main/NotWearingTights?action=source\" target=\"_blank\" rel=\"nofollow\">\n" +
            "<i class=\"fa fa-code\"></i> Page Source</a></li>\n" +
            "</ul>\n" +
            "</nav>\n" +
            "<div class=\"WikiWordModalStub\"></div>\n" +
            "<div class=\"ImgUploadModalStub\" data-page-type=\"Article\"></div>\n" +
            "<div class=\"login-alert\" style=\"display: none;\">\n" +
            "You need to <a href=\"/pmwiki/login.php\" style=\"color:#21A0E8\">login</a> to do this. <a href=\"/pmwiki/login.php?tab=register_account\" style=\"color:#21A0E8\">Get Known</a> if you don't have an account\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"main-content\" class=\"page-Article \">\n" +
            "<article id=\"main-entry\" class=\"with-sidebar\">\n" +
            "\n" +
            "<input type=\"hidden\" id=\"groupname-hidden\" value=\"Main\" />\n" +
            "<input type=\"hidden\" id=\"title-hidden\" value=\"NotWearingTights\" />\n" +
            "<input type=\"hidden\" id=\"article_id\" value=\"4676\" />\n" +
            "<input type=\"hidden\" id=\"logged_in\" value=\"false\" />\n" +
            "<p id=\"current_url\" class=\"hidden\">http://tvtropes.org/pmwiki/pmwiki.php/Main/NotWearingTights</p>\n" +
            "<meta itemprop=\"datePublished\" content=\"\" />\n" +
            "<meta itemprop=\"articleSection\" content=\"\" />\n" +
            "<meta itemprop=\"image\" content=\"\">\n" +
            "<a href=\"#watch\" class=\"watch-button \" data-modal-target=\"login\">Follow<span>ing</span></a>\n" +
            "<h1 itemprop=\"headline\" class=\"entry-title\">\n" +
            "Not Wearing Tights\n" +
            "</h1>\n" +
            "<a href=\"#mobile-actions-toggle\" id=\"mobile-actionbar-toggle\" class=\"mobile-actionbar-toggle mobile-on\" data-click-toggle=\"active\">\n" +
            "<p class=\"tiny-off\">Go To</p><span></span><span></span><span></span><i class=\"fa fa-pencil\"></i></a>\n" +
            "<nav id=\"mobile-actions-bar\" class=\"mobile-actions-wrapper mobile-on\"></nav>\n" +
            "<div id=\"editLockModal\" class=\"modal fade hidden-until-active\">\n" +
            "<div class=\"modal-dialog\">\n" +
            "<div class=\"modal-content\">\n" +
            "<div class=\"modal-header\">\n" +
            "<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> <span aria-hidden=\"true\">&times;</span></button>\n" +
            "<h4 class=\"modal-title\">Edit Locked</h4>\n" +
            "</div>\n" +
            "<div class=\"modal-body\">\n" +
            "<div class=\"row\">\n" +
            "<div class=\"body\">\n" +
            "<div class=\"danger troper_locked_message\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<nav class=\"body-options\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<ul class=\"subpage-links\">\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NotWearingTights\" class=\"subpage-link curr-subpage\" title=\"The Main page\">\n" +
            "<span class=\"wrapper\"><span class=\"spi main-page\"></span>Main</span></a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Laconic/NotWearingTights\" class=\"subpage-link \" title=\"The Laconic page\">\n" +
            "<span class=\"wrapper\"><span class=\"spi laconic-icon\"></span>Laconic</span></a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/PlayingWith/NotWearingTights\" class=\"subpage-link \" title=\"The PlayingWith page\">\n" +
            "<span class=\"wrapper\">PlayingWith</span></a>\n" +
            "</li>\n" +
            "<li class=\"create-subpage dropdown\">\n" +
            "<a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">\n" +
            "<span class=\"wrapper\">Create New <i class=\"fa fa-plus-circle\"></i></span>\n" +
            "</a>\n" +
            "<select onchange=\"this.options[this.selectedIndex].value && (window.location = this.options[this.selectedIndex].value);\">\n" +
            "<option value=\"\">- Create New -</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Analysis/NotWearingTights?action=edit\">Analysis</option>\n" +
            " <option value=\"/pmwiki/pmwiki.php/Characters/NotWearingTights?action=edit\">Characters</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/FanficRecs/NotWearingTights?action=edit\">FanficRecs</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/FanWorks/NotWearingTights?action=edit\">FanWorks</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Fridge/NotWearingTights?action=edit\">Fridge</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Haiku/NotWearingTights?action=edit\">Haiku</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Headscratchers/NotWearingTights?action=edit\">Headscratchers</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/ImageLinks/NotWearingTights?action=edit\">ImageLinks</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Quotes/NotWearingTights?action=edit\">Quotes</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Recap/NotWearingTights?action=edit\">Recap</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/ReferencedBy/NotWearingTights?action=edit\">ReferencedBy</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Synopsis/NotWearingTights?action=edit\">Synopsis</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Timeline/NotWearingTights?action=edit\">Timeline</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/Trivia/NotWearingTights?action=edit\">Trivia</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/WMG/NotWearingTights?action=edit\">WMG</option>\n" +
            "<option value=\"/pmwiki/pmwiki.php/YMMV/NotWearingTights?action=edit\">YMMV</option>\n" +
            "</select>\n" +
            "</li>\n" +
            "</ul>\n" +
            "</nav>\n" +
            "<div id=\"main-article\" class=\"article-content retro-folders\">\n" +
            "<p>\n" +
            "</p><div class=\"quoteright\" style=\"width:350px;\"><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/ComicBook/Wolverine\" title=\"/pmwiki/pmwiki.php/ComicBook/Wolverine\"><img src=\"https://static.tvtropes.org/pmwiki/pub/images/wolverine_9727.png\" class=\"embeddedimage\" border=\"0\" alt=\"https://static.tvtropes.org/pmwiki/pub/images/wolverine_9727.png\"></a></div>\n" +
            "<div class=\"acaptionright\" style=\"width:350px;\">\"Eh, looks about right.\"</div>\n" +
            "<p></p><div class=\"indent\"><em>\"Yeah, like Batman and Robin. Only... I ain't wearing no tights. You can wear tights, but I'm not wearing tights.\"</em>\n" +
            "<div class=\"indent\">&mdash; <strong>D.L.</strong>, <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Series/Heroes\" title=\"/pmwiki/pmwiki.php/Series/Heroes\">Heroes</a></em>\n" +
            "</div></div><div class=\"proper-ad-unit mobile-ad\"><h6 class=\"ad-caption\">Advertisement:</h6><div id=\"proper-ad-tvtropes_content_3\"><script>propertag.cmd.push(function() { proper_display('tvtropes_content_3'); })</script></div></div><p>These superheroes just aren't <em>called</em> superheroes. They often don't wear costumes or use <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/CodeName\" title=\"/pmwiki/pmwiki.php/Main/CodeName\">code names</a>, but they have abilities far beyond those of normal men, and are superheroes in all but name.\n" +
            "</p><p>Occasionally, such stories will <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/LampshadeHanging\" title=\"/pmwiki/pmwiki.php/Main/LampshadeHanging\">lampshade</a> the trope by having characters in <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ConversationalTroping\" title=\"/pmwiki/pmwiki.php/Main/ConversationalTroping\">off hand discussions</a> about whether they'd look good in a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/SuperheroesWearCapes\" title=\"/pmwiki/pmwiki.php/Main/SuperheroesWearCapes\">cape</a>, or using <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/SomethingPerson\" title=\"/pmwiki/pmwiki.php/Main/SomethingPerson\">Something Person</a>-style nicknames, but discarding the ideas as being \"silly.\" A \"<a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ThisIsReality\" title=\"/pmwiki/pmwiki.php/Main/ThisIsReality\">This Is Reality</a>\" remark can be thrown in, as well.\n" +
            "</p><p>Like many tropes this one has underlying practical considerations, such as:\n" +
            "</p><p></p><ul><li> Aesthetics: Most classic comic book-style superhero costumes tend to look very silly in live action, which is why <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/MovieSuperheroesWearBlack\" title=\"/pmwiki/pmwiki.php/Main/MovieSuperheroesWearBlack\">Movie Superheroes Wear Black</a>. Plus, with a few relatively rare exceptions (such as <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Creator/ChristopherReeve\" title=\"/pmwiki/pmwiki.php/Creator/ChristopherReeve\">Christopher Reeve</a> as <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Franchise/Superman\" title=\"/pmwiki/pmwiki.php/Franchise/Superman\">Superman</a>, <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Creator/LyndaCarter\" title=\"/pmwiki/pmwiki.php/Creator/LyndaCarter\">Lynda Carter</a> as <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Franchise/WonderWoman\" title=\"/pmwiki/pmwiki.php/Franchise/WonderWoman\">Wonder Woman</a>, or <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Creator/ScarlettJohansson\" title=\"/pmwiki/pmwiki.php/Creator/ScarlettJohansson\">Scarlett Johansson</a> as <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Comicbook/BlackWidow\" title=\"/pmwiki/pmwiki.php/Comicbook/BlackWidow\">Black Widow</a>) it is very difficult to cast someone who physically resembles comic book interpretations (especially in cases where body shapes are exaggerated).\n" +
            "</li><div class=\"proper-ad-unit mobile-ad\"><h6 class=\"ad-caption\">Advertisement:</h6><div id=\"proper-ad-tvtropes_content_2\"><script>propertag.cmd.push(function() { proper_display('tvtropes_content_2'); })</script></div></div><li> <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/GenreShift\" title=\"/pmwiki/pmwiki.php/Main/GenreShift\">Genre Shift</a>: When the creator is actually aiming for the story to look and feel as if it belongs in <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ScienceFiction\" title=\"/pmwiki/pmwiki.php/Main/ScienceFiction\">Science Fiction</a> or <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/UrbanFantasy\" title=\"/pmwiki/pmwiki.php/Main/UrbanFantasy\">Urban Fantasy</a> categories, and does not initially realize that the story fits the conventions of the super hero genre. They may or may not act kindly to people pointing out the similarities.\n" +
            "</li><li> Marketing: Some creators may wish to avoid their characters being seen as superheroes in order to prevent incorrect expectations of the work. The marketers may also want to play up the popularity of their lead actor or actress, <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/MarqueeAlterEgo\" title=\"/pmwiki/pmwiki.php/Main/MarqueeAlterEgo\">meaning that a face-covering mask is a big no-no</a>.\n" +
            "</li><li> Budget: Mostly affects TV shows rather than films. Most live-action shows have to work within very tight budgets, so it can be difficult to create a faithful translation of a comic outfit without it looking cheesey or low rent. The <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Film/JusticeLeagueOfAmerica\" title=\"/pmwiki/pmwiki.php/Film/JusticeLeagueOfAmerica\">Justice League of America</a></em> pilot and the later seasons of <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Series/Smallville\" title=\"/pmwiki/pmwiki.php/Series/Smallville\">Smallville</a></em> are rather infamous for having comic-accurate but <em>extremely</em> cheesey looking costumes, for instance.\n" +
            "</li><div class=\"proper-ad-unit mobile-ad\"><h6 class=\"ad-caption\">Advertisement:</h6><div id=\"proper-ad-tvtropes_content_1\"><script>propertag.cmd.push(function() { proper_display('tvtropes_content_1'); })</script></div></div><li> Legal: Licensing for intellectual properties can be <em>very</em> complicated and they may be unable to use the iconic costume of the hero but can still use the character itself. A well-known example is <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Series/Smallville\" title=\"/pmwiki/pmwiki.php/Series/Smallville\">Smallville</a></em> where they had the rights to use Clark Kent and some back story elements but not have the rights to show Superman (for most of the series).\n" +
            "</li></ul><p>Compare with <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ScifiGhetto\" title=\"/pmwiki/pmwiki.php/Main/ScifiGhetto\">Scifi Ghetto</a>, <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/NotUsingTheZWord\" title=\"/pmwiki/pmwiki.php/Main/NotUsingTheZWord\">Not Using the \"Z\" Word</a>, <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/AnimationAgeGhetto\" title=\"/pmwiki/pmwiki.php/Main/AnimationAgeGhetto\">Animation Age Ghetto</a>. See also <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/CivvieSpandex\" title=\"/pmwiki/pmwiki.php/Main/CivvieSpandex\">Civvie Spandex</a> and <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/SpandexLatexOrLeather\" title=\"/pmwiki/pmwiki.php/Main/SpandexLatexOrLeather\">Spandex, Latex, or Leather</a>. Series in which people are <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/NotWearingTights\" title=\"/pmwiki/pmwiki.php/Main/NotWearingTights\">Not Wearing Tights</a> typically use a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/DifferentlyPoweredIndividual\" title=\"/pmwiki/pmwiki.php/Main/DifferentlyPoweredIndividual\">Differently Powered Individual</a> label.\n" +
            "</p><hr><h2>Examples</h2>\n" +
            "<p></p><div class=\"folderlabel\" onclick=\"toggleAllFolders();\">&nbsp;&nbsp;&nbsp;&nbsp;open/close all folders&nbsp; </div>\n" +
            "<p></p><div class=\"folderlabel\" onclick=\"togglefolder('folder0');\">&nbsp;&nbsp;&nbsp;&nbsp; Anime and Manga&nbsp;</div><div id=\"folder0\" class=\"folder\" isfolder=\"true\" style=\"display:block;\">\n" +
            "<ul><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/DarkerThanBlack\" title=\"/pmwiki/pmwiki.php/Anime/DarkerThanBlack\">Darker Than Black</a></em> is a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/Seinen\" title=\"/pmwiki/pmwiki.php/Main/Seinen\">seinen</a> series, but its \"Contractors\" are superheroes in all but name &mdash; <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/Deconstruction\" title=\"/pmwiki/pmwiki.php/Main/Deconstruction\">and with a decidedly darker twist</a>. Overall, the whole Contractor idea and the prejudice against them has rather a similarity to mutants in <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/ComicBook/XMen\" title=\"/pmwiki/pmwiki.php/ComicBook/XMen\">X-Men</a> (although this is one of the few cases where the Fantastic Racists actually might have a good point). Also, the protagonist Hei wears a mask and uses a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/GrapplingHookPistol\" title=\"/pmwiki/pmwiki.php/Main/GrapplingHookPistol\">Grappling-Hook Pistol</a> but <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/NotUsingTheZWord\" title=\"/pmwiki/pmwiki.php/Main/NotUsingTheZWord\">no one uses the \"s-word\"</a> to describe him.\n" +
            "<ul><li> ...though <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/Shinigami\" title=\"/pmwiki/pmwiki.php/Main/Shinigami\">another \"s-word\"</a> was used even before he became Contractor.\n" +
            "</li><li> This is actually more averted after the first series, as the <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/Interquel\" title=\"/pmwiki/pmwiki.php/Main/Interquel\">interquel</a> manga, set after the Masquerade is exposed, the news does explicitly compare Contractors to comic book characters. Also, as of the second season, Hei's not the only character who wears a costume. A female Contractor with <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ImplausibleFencingPowers\" title=\"/pmwiki/pmwiki.php/Main/ImplausibleFencingPowers\">Implausible Fencing Powers</a> dresses in a black \"ninja-like\" outfit and a guy not only has a magic-themed power and Renumeration, but he also dresses like one as well.\n" +
            "</li><li> In a flashback to the Heaven's Gate war, Bai is shown to dress similar to a superhero.\n" +
            "</li></ul></li><li> Lelouch in <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/CodeGeass\" title=\"/pmwiki/pmwiki.php/Anime/CodeGeass\">Code Geass</a></em> dresses as Zero in costume, cape, and mask and turns his <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/LargeHam\" title=\"/pmwiki/pmwiki.php/Main/LargeHam\">Large Ham</a> quotient up to 11. He is a definite fit for the <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/RichIdiotWithNoDayJob\" title=\"/pmwiki/pmwiki.php/Main/RichIdiotWithNoDayJob\">Rich Idiot with No Day Job</a> idea. It's definitely implied that Lelouch was inspired by superheroes, as <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/AllThereInTheManual\" title=\"/pmwiki/pmwiki.php/Main/AllThereInTheManual\">side materials</a> make off-hand references to him liking comic books and <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/Toku\" title=\"/pmwiki/pmwiki.php/Main/Toku\">Toku</a> as a child.\n" +
            "<ul><li> He <em>promoted himself to Batman as a PR move.</em> He called his terrorist organization 'The Black Knights' and had them publicly running around defeating drug dealers and terrorists with less PR-savvy. (He also actually employs a professional news-spinner to work on his PR in this period.) Though the suit itself is agreed to look more like <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/OurVampiresAreDifferent\" title=\"/pmwiki/pmwiki.php/Main/OurVampiresAreDifferent\">Space Dracula</a>.\n" +
            "</li></ul></li><li> Li'l Slugger from <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/ParanoiaAgent\" title=\"/pmwiki/pmwiki.php/Anime/ParanoiaAgent\">Paranoia Agent</a></em>: While hitting people in the head with a baseball bat isn't much of a superpower he definitely invokes a secretive vigilante image.\n" +
            "<ul><li> Over time, <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/EldritchAbomination\" title=\"/pmwiki/pmwiki.php/Main/EldritchAbomination\">he becomes a lot worse than that...</a>\n" +
            "</li></ul></li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/Needless\" title=\"/pmwiki/pmwiki.php/Manga/Needless\">NEEDLESS</a></em>, similar to <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/DarkerThanBlack\" title=\"/pmwiki/pmwiki.php/Manga/DarkerThanBlack\">Darker Than Black</a></em>, features many X-Men-like characters, but dives a great deal more consciously into other Superhero tropes.\n" +
            "</li><li> In the <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/Wolverine\" title=\"/pmwiki/pmwiki.php/Anime/Wolverine\">Wolverine</a></em> anime, the title character doesn't wear his trademark yellow costume from the comics.\n" +
            "</li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/SpeedGrapher\" title=\"/pmwiki/pmwiki.php/Anime/SpeedGrapher\">Speed Grapher</a></em> has a super-powered hero who fights against similarly super-powered villains in a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/MonsterOfTheWeek\" title=\"/pmwiki/pmwiki.php/Main/MonsterOfTheWeek\">Monster of the Week</a> format. His similarity to a super-hero is lampshaded at one point by Ginza, who seeing his powers for the first time, comments sarcastically, \"Silly me thinking comic books were fake.\" The <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/BigBad\" title=\"/pmwiki/pmwiki.php/Main/BigBad\">Big Bad</a>, Suitengu is a classic <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/DiabolicalMastermind\" title=\"/pmwiki/pmwiki.php/Main/DiabolicalMastermind\">Diabolical Mastermind</a> supervillain, and like V of <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/ComicBook/VForVendetta\" title=\"/pmwiki/pmwiki.php/ComicBook/VForVendetta\">V for Vendetta</a></em> is the product of <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/PlayingWithSyringes\" title=\"/pmwiki/pmwiki.php/Main/PlayingWithSyringes\">Playing with Syringes</a>.\n" +
            "</li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/DNAngel\" title=\"/pmwiki/pmwiki.php/Manga/DNAngel\">D.N.Angel</a></em> has a boy who turns into a master thief with big black wings and special powers, and steals cursed items to purify them.\n" +
            "</li><li> In <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/Trigun\" title=\"/pmwiki/pmwiki.php/Manga/Trigun\">Trigun</a></em>, Vash the Stampede is a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/HumanAlien\" title=\"/pmwiki/pmwiki.php/Main/HumanAlien\">Human Alien</a> who wears a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/BadassLongcoat\" title=\"/pmwiki/pmwiki.php/Main/BadassLongcoat\">futuristic red coat</a>, carries a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/HandCannon\" title=\"/pmwiki/pmwiki.php/Main/HandCannon\">customized revolver</a> and has superpowers. <span class=\"spoiler\" title=\"you can set spoilers visible by default on your profile\"> And has a cyborg left arm with a minigun in it.</span> Wolfwood is a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/BadassPreacher\" title=\"/pmwiki/pmwiki.php/Main/BadassPreacher\">Badass Preacher</a> who carries a giant cross of massive destruction. <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/TheyFightCrime\" title=\"/pmwiki/pmwiki.php/Main/TheyFightCrime\">They Fight Crime!</a>! Or at least, they fight Vash's <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/EvilTwin\" title=\"/pmwiki/pmwiki.php/Main/EvilTwin\">Evil Twin</a> <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/OmnicidalManiac\" title=\"/pmwiki/pmwiki.php/Main/OmnicidalManiac\">Omnicidal Maniac</a> <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ArchEnemy\" title=\"/pmwiki/pmwiki.php/Main/ArchEnemy\">Arch-Enemy</a> (who has similar or greater powers) and his minions.\n" +
            "<ul><li> Said minions being, essentially, a team of supervillains.\n" +
            "</li></ul></li><li> About a dozen episodes into <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/NurseAngelRirikaSOS\" title=\"/pmwiki/pmwiki.php/Manga/NurseAngelRirikaSOS\">Nurse Angel Ririka SOS</a></em>, Seiya, the sidekick, becomes an <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/EmpoweredBadassNormal\" title=\"/pmwiki/pmwiki.php/Main/EmpoweredBadassNormal\">Empowered Badass Normal</a>. He doesn't have a <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/SecretIdentity\" title=\"/pmwiki/pmwiki.php/Main/SecretIdentity\">Secret Identity</a> and delusions of <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/SuperHero\" title=\"/pmwiki/pmwiki.php/Main/SuperHero\">Super Hero</a> pageantry get knocked out of him pretty quickly. Instead, he throws around energy projectiles and gets into aerial battles wearing jeans and a hoodie.\n" +
            "</li><li> Many shonen series are based around constant combat between good and evil people with unique or nearly unique superpowers (but often a common <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/MetaOrigin\" title=\"/pmwiki/pmwiki.php/Main/MetaOrigin\">Meta Origin</a>, such as being a ninja or <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/Shinigami\" title=\"/pmwiki/pmwiki.php/Main/Shinigami\">shinigami</a>)\n" +
            "<ul><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/OnePiece\" title=\"/pmwiki/pmwiki.php/Manga/OnePiece\">One Piece</a>.</em>\n" +
            "</li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/Naruto\" title=\"/pmwiki/pmwiki.php/Anime/Naruto\">Naruto</a></em>\n" +
            "</li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/Bleach\" title=\"/pmwiki/pmwiki.php/Manga/Bleach\">Bleach</a></em>\n" +
            "</li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/YuYuHakusho\" title=\"/pmwiki/pmwiki.php/Manga/YuYuHakusho\">YuYu Hakusho</a></em>\n" +
            "</li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/FairyTail\" title=\"/pmwiki/pmwiki.php/Manga/FairyTail\">Fairy Tail</a></em>\n" +
            "</li></ul></li><li> <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Manga/ACertainScientificRailgun\" title=\"/pmwiki/pmwiki.php/Manga/ACertainScientificRailgun\">A Certain Scientific Railgun</a></em> is full of supers, <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/TheHero\" title=\"/pmwiki/pmwiki.php/Main/TheHero\">the morality</a> <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/AntiHero\" title=\"/pmwiki/pmwiki.php/Main/AntiHero\">of whom</a> <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/ItsAllAboutMe\" title=\"/pmwiki/pmwiki.php/Main/ItsAllAboutMe\">are all over</a> <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/AntiVillain\" title=\"/pmwiki/pmwiki.php/Main/AntiVillain\">the spectrum</a>. About the only one who think of himself as a superhero is Gunha Sogiita, one of the Level 5. <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/NarmCharm\" title=\"/pmwiki/pmwiki.php/Main/NarmCharm\">His appearance match his attitude.</a>\n" +
            "</li><li> Played with in <em><a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Anime/DragonBallZ\" title=\"/pmwiki/pmwiki.php/Anime/DragonBallZ\">Dragon Ball Z</a></em>. While the main cast don't fit the mold of superheroes, they do have most of the traits covered by one person or another within the group. The cast's outfits are all rather colorful, but for most of them this is a way to represent the martial arts schools that they come from. Vegeta's preferred outfit includes <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/FutureSpandex\" title=\"/pmwiki/pmwiki.php/Main/FutureSpandex\">Future Spandex</a>, but that's because it's a part of his iconic Saiyan armor. Piccolo's outfit <a class=\"twikilink\" href=\"/pmwiki/pmwiki.php/Main/SuperheroesWearCapes\" title=\"/pmwiki/pmwiki.php/Main/SuperheroesWearCapes\">includes a cape</a>, but said cape is weighted and mostly used for training, and he'll toss it if a fight starts to get serious. Notably, the only character that fully averts this trope is teen Gohan, who adopts a superhero persona in order to hide his identity from his classmates, and is portrayed as a complete dork in doing so. This trope is played straightest by Future Trunks, who fights in plain clothes until Bulma makes him some Saiyan armor.\n" +
            "</li></ul></div></div>\n" +
            "<hr>\n" +
            "</div>\n" +
            "<div class=\"alt-titles section section-fact\">\n" +
            "<h3>\n" +
            "<strong>Alternative Title(s):</strong>\n" +
            "<span>Non Costumed Super Being</span> </h3>\n" +
            "</div>\n" +
            "<div class=\"section-links\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<div class=\"titles\">\n" +
            "<div><h3 class=\"text-center text-uppercase\">Previous</h3></div>\n" +
            "<div><h3 class=\"text-center text-uppercase\">Index</h3></div>\n" +
            "<div><h3 class=\"text-center text-uppercase\">Next</h3></div>\n" +
            "</div>\n" +
            "<div class=\"links\">\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NonPoweredCostumedHero\">Non-Powered Costumed Hero</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/StandardSuperheroSuits\">Standard Superhero Suits</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/PaintedOnPants\">Painted-On Pants</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/MovieSuperheroesWearBlack\">Movie Superheroes Wear Black</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/GoodGuysGarb\">Good Guys Garb</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/PinkHeroine\">Pink Heroine</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NotHisSled\">Not His Sled</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/MediaAdaptationTropes\">Media Adaptation Tropes</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/Novelization\">Novelization</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NotUsingTheZWord\">Not Using the \"Z\" Word</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/SpeculativeFictionTropes\">Speculative Fiction Tropes</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NoWarpingZone\">No Warping Zone</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Film/TheWolverine\">The Wolverine</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/ImageSource/LiveActionFilmsMToZ\">ImageSource/Live-Action Films (M to Z)</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Film/XMenDaysOfFuturePast\">X-Men: Days of Future Past</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NotTheFallThatKillsYou\">Not the Fall That Kills You</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/SuperheroTropes\">Superhero Tropes</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/OnePersonOnePower\">One Person, One Power</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/HealingFactor\">Healing Factor</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/ImageSource/ComicBooks\">ImageSource/Comic Books</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/UnbreakableBones\">Unbreakable Bones</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/MeeknessIsWeakness\">Meekness Is Weakness</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/QuoteSource/LiveActionTV\">QuoteSource/Live-Action TV</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/SinsOfOurFathers\">Sins of Our Fathers</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<ul>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/NotTheFallThatKillsYou\">Not the Fall That Kills You</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/JustForFun/TropeNamesForABand\">JustForFun/Trope Names for a Band</a>\n" +
            "</li>\n" +
            "<li>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Main/TheNthDoctor\">The Nth Doctor</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "</div>\n" +
            "</article>\n" +
            "<div id=\"main-content-sidebar\">\n" +
            "<div class=\"sidebar-item quick-links\" itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<a href=\"/pmwiki/query.php?type=att\">Ask The Tropers</a>\n" +
            "<a href=\"/pmwiki/query.php?type=tf\">Trope Finder</a>\n" +
            "<a href=\"/pmwiki/query.php?type=ykts\">You Know That Show...</a>\n" +
            "<a href=\"/pmwiki/tlp_activity.php\">Trope Launch Pad</a>\n" +
            "<a href=\"/pmwiki/review_activity.php\">Reviews</a>\n" +
            "<a href=\"/pmwiki/lbs.php\">Live Blogs</a>\n" +
            "</div>\n" +
            "<div class=\"sidebar-item display-options\">\n" +
            "<p class=\"sidebar-item-title\" data-title=\"Display\">Display</p>\n" +
            "<ul class=\"sidebar display-toggles\">\n" +
            " <li>Show Spoilers <div id=\"sidebar-toggle-showspoilers\" class=\"display-toggle show-spoilers\"></div></li>\n" +
            "<li>Night Vision <div id=\"sidebar-toggle-nightvision\" class=\"display-toggle night-vision\"></div></li>\n" +
            "<li>Sticky Header <div id=\"sidebar-toggle-stickyheader\" class=\"display-toggle sticky-header\"></div></li>\n" +
            "<li>Wide Load <div id=\"sidebar-toggle-wideload\" class=\"display-toggle wide-load\"></div></li>\n" +
            "</ul>\n" +
            "<script>updateDesktopPrefs();</script>\n" +
            "</div>\n" +
            "<div class=\"sidebar-item ad sb-ad-unit\">\n" +
            "<div class='proper-ad-unit '>\n" +
            "<div id='proper-ad-tvtropes_side_1'> <script>propertag.cmd.push(function() { proper_display('tvtropes_side_1'); });</script> </div>\n" +
            "</div></div>\n" +
            "<div class=\"sidebar-item\">\n" +
            "<p class=\"sidebar-item-title\" data-title=\"Crucial Browsing\">Crucial Browsing</p>\n" +
            "<ul class=\"padded font-s\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<li><a href=\"javascript:void(0);\" data-click-toggle=\"active\">Genre</a>\n" +
            "<ul>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/ActionAdventureTropes' title='Main/ActionAdventureTropes'>Action Adventure</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/ComedyTropes' title='Main/ComedyTropes'>Comedy</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/CommercialsTropes' title='Main/CommercialsTropes'>Commercials</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/CrimeAndPunishmentTropes' title='Main/CrimeAndPunishmentTropes'>Crime &amp; Punishment</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/DramaTropes' title='Main/DramaTropes'>Drama</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/HorrorTropes' title='Main/HorrorTropes'>Horror</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/LoveTropes' title='Main/LoveTropes'>Love</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/NewsTropes' title='Main/NewsTropes'>News</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/ProfessionalWrestling' title='Main/ProfessionalWrestling'>Professional Wrestling</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/SpeculativeFictionTropes' title='Main/SpeculativeFictionTropes'>Speculative Fiction</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/SportsStoryTropes' title='Main/SportsStoryTropes'>Sports Story</a></li>\n" +
            "<li><a href='/pmwiki/pmwiki.php/Main/WarTropes' title='Main/WarTropes'>War</a></li>\n" +
            "</ul>\n" +
            "</li>\n" +
            "<li><a href=\"javascript:void(0);\" data-click-toggle=\"active\">Media</a>\n" +
            "<ul>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Media\" title=\"Main/Media\">All Media</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/AnimationTropes\" title=\"Main/AnimationTropes\">Animation (Western)</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Anime\" title=\"Main/Anime\">Anime</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/ComicBookTropes\" title=\"Main/ComicBookTropes\">Comic Book</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/FanFic\" title=\"FanFic/FanFics\">Fan Fics</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Film\" title=\"Main/Film\">Film</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/GameTropes\" title=\"Main/GameTropes\">Game</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Literature\" title=\"Main/Literature\">Literature</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/MusicAndSoundEffects\" title=\"Main/MusicAndSoundEffects\">Music And Sound Effects</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/NewMediaTropes\" title=\"Main/NewMediaTropes\">New Media</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/PrintMediaTropes\" title=\"Main/PrintMediaTropes\">Print Media</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Radio\" title=\"Main/Radio\">Radio</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/SequentialArt\" title=\"Main/SequentialArt\">Sequential Art</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/TabletopGames\" title=\"Main/TabletopGames\">Tabletop Games</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/UsefulNotes/Television\" title=\"Main/Television\">Television</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Theater\" title=\"Main/Theater\">Theater</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/VideogameTropes\" title=\"Main/VideogameTropes\">Videogame</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Webcomics\" title=\"Main/Webcomics\">Webcomics</a></li>\n" +
            "</ul>\n" +
            "</li>\n" +
            "<li><a href=\"javascript:void(0);\" data-click-toggle=\"active\">Narrative</a>\n" +
            "<ul>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/UniversalTropes\" title=\"Main/UniversalTropes\">Universal</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/AppliedPhlebotinum\" title=\"Main/AppliedPhlebotinum\">Applied Phlebotinum</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/CharacterizationTropes\" title=\"Main/CharacterizationTropes\">Characterization</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Characters\" title=\"Main/Characters\">Characters</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/CharactersAsDevice\" title=\"Main/CharactersAsDevice\">Characters As Device</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Dialogue\" title=\"Main/Dialogue\">Dialogue</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Motifs\" title=\"Main/Motifs\">Motifs</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/NarrativeDevices\" title=\"Main/NarrativeDevices\">Narrative Devices</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Paratext\" title=\"Main/Paratext\">Paratext</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Plots\" title=\"Main/Plots\">Plots</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Settings\" title=\"Main/Settings\">Settings</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Spectacle\" title=\"Main/Spectacle\">Spectacle</a></li>\n" +
            "</ul>\n" +
            "</li>\n" +
            "<li><a href=\"javascript:void(0);\" data-click-toggle=\"active\">Other Categories</a>\n" +
            "<ul>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/BritishTellyTropes\" title=\"Main/BritishTellyTropes\">British Telly</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/TheContributors\" title=\"Main/TheContributors\">The Contributors</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/CreatorSpeak\" title=\"Main/CreatorSpeak\">Creator Speak</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Creators\" title=\"Main/Creators\">Creators</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/DerivativeWorks\" title=\"Main/DerivativeWorks\">Derivative Works</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/LanguageTropes\" title=\"Main/LanguageTropes\">Language</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/LawsAndFormulas\" title=\"Main/LawsAndFormulas\">Laws And Formulas</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/ShowBusiness\" title=\"Main/ShowBusiness\">Show Business</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/SplitPersonalityTropes\" title=\"Main/SplitPersonalityTropes\">Split Personality</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/StockRoom\" title=\"Main/StockRoom\">Stock Room</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/TropeTropes\" title=\"Main/TropeTropes\">Trope</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Tropes\" title=\"Main/Tropes\">Tropes</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/TruthAndLies\" title=\"Main/TruthAndLies\">Truth And Lies</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/TruthInTelevision\" title=\"Main/TruthInTelevision\">Truth In Television</a></li>\n" +
            "</ul>\n" +
            "</li>\n" +
            "<li><a href=\"javascript:void(0);\" data-click-toggle=\"active\">Topical Tropes</a>\n" +
            "<ul>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/BetrayalTropes\" title=\"Main/BetrayalTropes\">Betrayal</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/CensorshipTropes\" title=\"Main/CensorshipTropes\">Censorship</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/CombatTropes\" title=\"Main/CombatTropes\">Combat</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/DeathTropes\" title=\"Main/DeathTropes\">Death</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/FamilyTropes\" title=\"Main/FamilyTropes\">Family</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/FateAndProphecyTropes\" title=\"Main/FateAndProphecyTropes\">Fate And Prophecy</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/FoodTropes\" title=\"Main/FoodTropes\">Food</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/HolidayTropes\" title=\"Main/HolidayTropes\">Holiday</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/MemoryTropes\" title=\"Main/MemoryTropes\">Memory</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/MoneyTropes\" title=\"Main/MoneyTropes\">Money</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/MoralityTropes\" title=\"Main/MoralityTropes\">Morality</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/PoliticsTropes\" title=\"Main/PoliticsTropes\">Politics</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/ReligionTropes\" title=\"Main/ReligionTropes\">Religion</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/SchoolTropes\" title=\"Main/SchoolTropes\">School</a></li>\n" +
            "</ul>\n" +
            "</li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "<div class=\"sidebar-item sb-ad-unit\">\n" +
            "<div class=\"sidebar-section\">\n" +
            "<div class=\"square_ad ad-size-300x600 ad-section text-center\">\n" +
            "<div class='proper-ad-unit '>\n" +
            "<div id='proper-ad-tvtropes_side_2'> <script>propertag.cmd.push(function() { proper_display('tvtropes_side_2'); });</script> </div>\n" +
            "</div> </div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"sidebar-item showcase\">\n" +
            "<p class=\"sidebar-item-title\" data-title=\"Community&nbsp;Showcase\">Community Showcase <a href=\"/pmwiki/showcase.php\" class=\"bubble float-right hover-blue\">More</a></p>\n" +
            "<p class=\"community-showcase\">\n" +
            "<a href=\"https://sharetv.com/shows/echo_chamber\" target=\"_blank\" onclick=\"trackOutboundLink('https://sharetv.com/shows/echo_chamber');\">\n" +
            "<img src=\"https://static.tvtropes.org/images/communityShowcase-echochamber.jpg\" alt=\"\"></a>\n" +
            "<a href=\"http://www.charactour.com/home\" target=\"_blank\" onclick=\"trackOutboundLink('http://www.charactour.com/home');\">\n" +
            "<img src=\"https://static.tvtropes.org/images/communityShowcase-charactour.jpg\" alt=\"\"></a>\n" +
            "<a href=\"/pmwiki/pmwiki.php/Webcomic/TwistedTropes\" );\">\n" +
            "<img src=\"https://static.tvtropes.org/img/howlandsc-side.jpg\" alt=\"\"></a>\n" +
            "</p>\n" +
            "</div>\n" +
            "<div id=\"stick-cont\" class=\"sidebar-item sb-ad-unit\">\n" +
            "<div id=\"stick-bar\" class=\"sidebar-section\">\n" +
            "<div class=\"square_ad ad-size-300x600 ad-section text-center\">\n" +
            "<div class='proper-ad-unit '>\n" +
            "<div id='proper-ad-tvtropes_side_3'> <script>propertag.cmd.push(function() { proper_display('tvtropes_side_3'); });</script> </div>\n" +
            "</div> </div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"action-bar-bottom\" class=\"action-bar tablet-off\">\n" +
            "<a href=\"#top-of-page\" class=\"scroll-to-top\">Top</a>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"footer-ad-wrapper\" class=\"ad\">\n" +
            "<div id=\"footer-ad\">\n" +
            "<div class=\"ad-size-970x90-alt btf_banner\">\n" +
            "<div class='proper-ad-unit '>\n" +
            "<div id='proper-ad-tvtropes_main_2'> <script>propertag.cmd.push(function() { proper_display('tvtropes_main_2'); });</script> </div>\n" +
            "</div> </div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class='proper-ad-unit ad-sticky'>\n" +
            "<div id='proper-ad-tvtropes_sticky_1'> <script>propertag.cmd.push(function() { proper_display('tvtropes_sticky_1'); });</script> </div>\n" +
            "</div>\n" +
            "<footer id=\"main-footer\">\n" +
            "<div id=\"main-footer-inner\">\n" +
            "<div class=\"footer-left\">\n" +
            "<a href=\"/\" class=\"img-link\"><img src=\"https://static.tvtropes.org/img/tvtropes-footer-logo.png\" alt=\"TV Tropes\" title=\"TV Tropes\" /></a>\n" +
            "<form action=\"index.html\" id=\"cse-search-box-mobile\" class=\"navbar-form newsletter-signup validate modal-replies\" name=\"\" role=\"\" data-ajax-get=\"/ajax/subscribe_email.php\">\n" +
            "<button class=\"btn-submit newsletter-signup-submit-button\" type=\"submit\" id=\"subscribe-btn\"><i class=\"fa fa-paper-plane\"></i></button>\n" +
            "<input id=\"subscription-email\" type=\"text\" class=\"form-control\" name=\"q\" size=\"31\" placeholder=\"Subscribe\" value=\"\" validate-type=\"email\">\n" +
            "</form>\n" +
            "<ul class=\"social-buttons\">\n" +
            "<li><a class=\"btn fb\" target=\"_blank\" onclick=\"_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-facebook']);\" href=\"https://www.facebook.com/tvtropes\"><i class=\"fa fa-facebook\"></i></a></li>\n" +
            "<li><a class=\"btn tw\" target=\"_blank\" onclick=\"_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-twitter']);\" href=\"https://www.twitter.com/tvtropes\"><i class=\"fa fa-twitter\"></i></a> </li>\n" +
            "<li><a class=\"btn rd\" target=\"_blank\" onclick=\"_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-reddit']);\" href=\"https://www.reddit.com/r/tvtropes\"><i class=\"fa fa-reddit-alien\"></i></a></li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<ul class=\"footer-menu\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<li><h4 class=\"footer-menu-header\">TVTropes</h4></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Main/Administrivia\">About TVTropes</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Administrivia/TheGoalsOfTVTropes\">TVTropes Goals</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Administrivia/TheTropingCode\">Troping Code</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/Administrivia/TVTropesCustoms\">TVTropes Customs</a></li>\n" +
            "<li><a href=\"/pmwiki/pmwiki.php/JustForFun/TropesOfLegend\">Tropes of Legend</a></li>\n" +
            "</ul>\n" +
            "<hr />\n" +
            "<ul class=\"footer-menu\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<li><h4 class=\"footer-menu-header\">Community</h4></li>\n" +
            "<li><a href=\"/pmwiki/query.php?type=att\">Ask The Tropers</a></li>\n" +
            "<li><a href=\"/pmwiki/tlp_activity.php\">Trope Launch Pad</a></li>\n" +
            "<li><a href=\"/pmwiki/query.php?type=tf\">Trope Finder</a></li>\n" +
            "<li><a href=\"/pmwiki/query.php?type=ykts\">You Know That Show</a></li>\n" +
            "<li><a href=\"/pmwiki/lbs.php\">Live Blogs</a></li>\n" +
            "<li><a href=\"/pmwiki/review_activity.php\">Reviews</a></li>\n" +
            "<li><a href=\"/pmwiki/topics.php\">Forum</a></li>\n" +
            "</ul>\n" +
            "<hr />\n" +
            "<ul class=\"footer-menu\" itemscope itemtype=\"http://schema.org/SiteNavigationElement\">\n" +
            "<li><h4 class=\"footer-menu-header\">Tropes HQ</h4></li>\n" +
            "<li><a href=\"/pmwiki/about.php\">About Us</a></li>\n" +
            "<li><a href=\"/pmwiki/contact.php\">Contact Us</a></li>\n" +
            "<li><a href=\"/pmwiki/dmca.php\">DMCA Notice</a></li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "<div id=\"desktop-on-mobile-toggle\" class=\"text-center gutter-top gutter-bottom tablet-on\">\n" +
            "<a href=\"/pmwiki/switchDeviceCss.php?mobileVersion=1\" rel=\"nofollow\">Switch to <span class=\"txt-desktop\">Desktop</span><span class=\"txt-mobile\">Mobile</span> Version</a>\n" +
            "</div>\n" +
            "<div class=\"legal\">\n" +
            "<p>TVTropes is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. <br>Permissions beyond the scope of this license may be available from <a xmlns:cc=\"http://creativecommons.org/ns#\" href=\"mailto:thestaff@tvtropes.org\" rel=\"cc:morePermissions\"> thestaff@tvtropes.org</a>. <a href=\"/pmwiki/privacypolicy.php\">Privacy Policy</a></p>\n" +
            "</div>\n" +
            "</footer>\n" +
            "<script type='text/javascript'>\n" +
            "        window.special_ops =  {\n" +
            "            member : 'no',\n" +
            "            isolated : 1,\n" +
            "            tags : ['unknown']\n" +
            "        };\n" +
            "    </script>\n" +
            "<!--[if IE]>\n" +
            "    <script type='text/javascript'>\n" +
            "        (function(){if(!/*@cc_on!@*/0)return;var e = \"abbr,article,aside,audio,bb,canvas,datagrid,datalist,details,dialog,eventsource,figure,footer,header,hgroup,mark,menu,meter,nav,output,progress,section,time,video\".split(','),i=e.length;while(i--){document.createElement(e[i])}})();\n" +
            "    </script>\n" +
            "    <![endif]-->\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "        var cleanCreativeEnabled = \"1\";\n" +
            "        var donation = \"\";\n" +
            "        var live_server = \"1\";\n" +
            "        var live_ads = \"1\";\n" +
            "        var img_domain = \"https://static.tvtropes.org\";\n" +
            "\n" +
            "                    var adblock_check = true;\n" +
            "        \n" +
            "        var elem = document.createElement('script');\n" +
            "        elem.async = true;\n" +
            "\n" +
            "        elem.src = 'https://static.tvtropes.org/design/assets/bundle.js?rev=232';\n" +
            "\n" +
            "        elem.onload = function() {\n" +
            "                                 }\n" +
            "        document.getElementsByTagName('head')[0].appendChild(elem);\n" +
            "\n" +
            "    </script>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
}
