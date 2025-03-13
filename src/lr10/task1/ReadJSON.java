package src.lr10.task1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadJSON {
    public static void main(String[] args) {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(
                    new FileReader("src/lr10/task1/books.json"));
            JSONObject jsonobject = (JSONObject) obj;
            System.out.println("Корневой элемент: " +
                    jsonobject.keySet().iterator().next());
            JSONArray books = (JSONArray) jsonobject.get("library");
            for (Object o: books){
                JSONObject book = (JSONObject) o;
                System.out.println("Текущий элемент JSONArray book:");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
