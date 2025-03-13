package src.lr10.task1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsThemeParser {
    public static void main(String[] args) {
        try {
            String url = "https://urfu.ru/get-news/ru/news" +
                    "/?cols=3&pid=53%2C11367%2C30302&" +
                    "categories=1%2C10%2C12%2C130%2C155%2C2%2C212%2C232%2C264%2C27%2C277%2C3%2C33%2C4%2C5%2C52%2C6%2C7%2C8%2C9%2C90%2C93%2C96&" +
                    "fullmode=1&offset=0&rows=5&selected=0&page=54&show_categories=1";

            Document document = Jsoup.connect(url).get();
            Elements news = document.select(".news-item");
            for(Element element: news){
                Elements dates = element.select(".date");
                Elements snippets = element.select(".snippet a");
                System.out.printf("Тема: %s\nДата: %s\n",
                    snippets.getFirst().text(),
                    dates.getFirst().text());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
