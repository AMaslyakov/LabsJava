package src.lr10.task1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJSON {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Нейромант");
        book1.put("author", "Уильям Гибсон");
        book1.put("year", 1984);

        JSONObject book2 = new JSONObject();
        book2.put("title", "Дюна");
        book2.put("author", "Френк Герберт");
        book2.put("year", 1965);

        books.add(book1);
        books.add(book2);

        library.put("library", books);

        try (FileWriter file = new FileWriter("src/lr10/task1/books.json")){
            file.write(library.toJSONString());
            System.out.println("Файл успешно создан!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
