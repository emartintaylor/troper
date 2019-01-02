package com.nagesagi.troper.parser;

import com.nagesagi.troper.models.Article;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebsiteArticleParser implements ArticleParser {
    @Override
    public Document parse(Document document){
        String title = document.getElementsByClass("entry-title").first().text();

        Element content = document.getElementById("main-article");

        if (content == null) //In case it wasn't parsable
            return Jsoup.parse("<html><body><h1>Error ");

        String mainColor = "white";
        String backColor = "black";
        String linkColor = "#33b5e5";
        String folderStyle = "text-align:center; border:1px; border-style:solid; background-color: black; border-color: #33b5e5; border-radius:8px; padding:6px;";

        //Remove unwanted elements
        content.select("ins").remove();
        content.select("script").remove();
        content.select("table").remove();
        content.select("iframe").remove();
        content.select(".pathholder").remove();
        content.select(".mobile-ad").remove();
        content.select(".folder").attr("style","display:none");

        Elements spoilers = content.select(".spoiler");
        for (Element spoiler : spoilers) {
            String spoilerHtml = "<text style=\"border-bottom: 1px solid #999999;\">" + spoiler.text() + "</text>";
            spoiler.html(spoilerHtml);
        }

        String htmlTitle = "<h1>"+title+"</h1>";
        return Jsoup.parse(head+htmlTitle+content.html()+footer);
    }

    String head = "<html><head>" +
            "<style type=\"text/css\">\n" +
            "div.folderlabel\n" +
            "{\n" +
            "   text-align:center;\n" +
            "   border:1px;\n" +
            "   border-style:solid;\n" +
            "   background-color: #EEF;\n" +
            "   border-color: #BBBBC3;\n" +
            "   border-radius:8px;\n" +
            "   padding:6px;\n" +
            "}\n" +
            ".indent {\n" +
            "  margin-left:24px;\n" +
            "}\n"+
            ".folder li {\n" +
            "  margin-botton: 3px;\n" +
            "}\n"+
            "div.quoteright {\n" +
            "  position:relative;\n" +
            "  background-color:transparent;\n" +
            "  width:150px;\n" +
            "  margin:6px;\n" +
            "  padding:4px;\n" +
            "  font-size:smaller;\n" +
            "  padding-bottom:0px;\n" +
            "  margin-bottom:0px;\n" +
            "  z-index:4;\n" +
            "}\n"+
            "img.embeddedimage {\n" +
            "  position:relative;\n" +
            "  margin:6px;\n" +
            "  padding:4px;\n" +
            "  max-width:350px;\n" +
            "}\n"+
            "div.acaptionright {\n" +
            "  position:relative;\n" +
            "  background:transparent;\n" +
            "  padding:4px;\n" +
            "  padding-top:0px;\n" +
            "  margin:6px;\n" +
            "  margin-top:0px;\n" +
            "  width:150px;\n" +
            "  max-width:350px;\n" +
            "  text-align:center;\n" +
            "  z-index:4;\n" +
            "}\n"+
            "</style><script type=\"text/javascript\">\n\n" +
            "function showSpoiler(tagID){\n" +
            " document.getElementById(tagID).style.display=\"\";\n" +
            " document.getElementById(tagID + 'a').style.display=\"none\";}\n" +
            "function togglefolder(folderID){\n" +
            " var current = document.getElementById(folderID).style.display;\n" +
            " if (current == \"none\") document.getElementById(folderID).style.display = \"\";\n" +
            " else document.getElementById(folderID).style.display = \"none\";}\n" +
            "var last_toggle=\"none\";\n"+
            "function toggleAllFolders(){\n" +
            "	var divs = document.getElementsByTagName(\"div\");\n" +
            "	for (var i=0; i<divs.length; i++){\n"+
            "		if (divs[i].getAttribute(\"isfolder\")==\"true\")\n"+
            "			if(last_toggle == \"block\")\n" +
            "				divs[i].style.display=\"none\";\n" +
            "			else\n" +
            "				divs[i].style.display=\"block\";}\n" +
            "	last_toggle=(last_toggle==\"block\"?\"none\":\"block\");}\n" +
            "function toggleinline(element){\n"+
            "	var divElement = element.getElementsByTagName(\"div\")[0];\n"+
            "	if (divElement.style.display == \"none\") divElement.style.display = \"\";\n" +
            "	else divElement.style.display = \"none\";}\n"+
            "function togglenote(element){\n"+
            "	var divElement = document.getElementById(element);\n" +
            "	if (divElement.style.display == \"none\") divElement.style.display = \"\";\n" +
            "	else divElement.style.display = \"none\";}\n"+
            "function nightMode() {\n"+
            "   document.body.style.color=\"white\";\n" +
            "   document.body.style.backgroundColor=\"black\";\n" +
            "   var links = document.getElementsByTagName(\"a\");\n" +
            "   for (var i=0;i<links.length;i++){\n" +
            "       if (links[i].getAttribute(\"onclick\") == null)\n" +
            "           links[i].style.color=\"#33b5e5\";\n" +
            "       else\n" +
            "          links[i].style.color=\"black\";\n" +
            "   }\n" +
            "   var folders = document.getElementsByClassName(\"folderlabel\");\n" +
            "   for (var i=0;i<folders.length;i++) {\n" +
            "       folders[i].style.backgroundColor=\"black\";\n" +
            "       folders[i].style.borderColor=\"#33b5e5\";\n" +
            "   }\n" +
            "}   \n" +
            "function dayMode() {\n"+
            "   document.body.style.color=\"black\";\n" +
            "   document.body.style.backgroundColor=\"white\";\n" +
            "   var links = document.getElementsByTagName(\"a\");\n" +
            "   for (var i=0;i<links.length;i++){\n" +
            "       if (links[i].getAttribute(\"onclick\") == null)\n" +
            "          links[i].style.color=\"#0000FF\";\n" +
            "       else\n" +
            "          links[i].style.color=\"white\";\n" +
            "   }\n" +
            "   var folders = document.getElementsByClassName(\"folderlabel\");\n" +
            "   for (var i=0;i<folders.length;i++) {\n" +
            "       folders[i].style.backgroundColor=\"#EEF\";\n" +
            "       folders[i].style.borderColor=\"#BBBBC3\";\n" +
            "   }\n" +
            "}\n" +
            "</script></head><body onload=\"nightMode()\"><div id=\"contentRoot\">";

    String footer ="</div></body></html>";
}
