package src.lr10.task4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class NewsParser {

    private static Document document;
    private static Elements latestNews;

    NewsParser() throws IOException {
        String MAIN_URL = "https://urfu.ru/get-news/ru/news" +
                "/?cols=3&pid=53%2C11367%2C30302&" +
                "categories=1%2C10%2C12%2C130%2C155%2C2%2C212%2C232%2C264%2C27%2C277%2C3%2C33%2C4%2C5%2C52%2C6%2C7%2C8%2C9%2C90%2C93%2C96&" +
                "fullmode=1&offset=0&rows=5&selected=0&page=54&show_categories=1";
        document = Jsoup.connect(MAIN_URL).get();
    }

    public void print_news(){
        Elements news = parse_news();
        latestNews = news;
         for(Element element: news){
                Elements dates = element.select(".date");
                Elements snippets = element.select(".snippet a");
                System.out.printf("Тема: %s\nДата: %s\n",
                    snippets.getFirst().text(),
                    dates.getFirst().text());
            }
    }

    public void save_news(){
        if(!latestNews.isEmpty()){
            String filepath = "src/lr10/task4/news.md";
            try (FileWriter writer = new FileWriter(filepath)) {
            for(Element element: latestNews){
               Elements dates = element.select(".date");
               Elements snippets = element.select(".snippet a");
               String url = snippets.getFirst().attr("abs:href");
               String date = dates.getFirst().text();
               String theme = snippets.getFirst().text();

               String header = String.format("## %s\n\n", theme);
               String link = String.format("[%s](%s)\n\n", url, url);
               String d = String.format("_%s_\n\n", date);

                   writer.write(header);
                   writer.write(link);
                   writer.write(d);
                }
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.out.println("Произошла ошибка при записи в файл.");
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Новости не получены!");
        }
    }

    Elements parse_news(){
        return document.select(".news-item");
    }

}
