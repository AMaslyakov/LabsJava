package src.lr10.task3;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("<Music Bank>");
        System.out.println("Команды:");
        System.out.println("a - добавить песню");
        System.out.println("s - найти все песни исполнителя");
        System.out.println("d - удалить песню");
        System.out.println("p - вывести список всех песен");
        System.out.println("q - выйти");

        String json_file = "src/lr10/task3/songs.json";
        Scanner input = new Scanner(System.in);
        try {
            SongParserJSON music_bank = new SongParserJSON(json_file);
            while (true){
               System.out.println("Введите команду(q - выйти):");
               char command =  input.nextLine().charAt(0);

               if(command == 'q'){
                   break;
               }

               switch (command){
                   case 'a':
                       add(music_bank);
                       break;
                   case 's':
                       search(music_bank);
                       break;
                   case 'd':
                       delete(music_bank);
                       break;
                   case 'p':
                       music_bank.print_songs();
                       break;


               }
            }

        }catch (IOException | ParseException e){
            System.out.println(e.getMessage());
        }
    }

    static void search(SongParserJSON music_bank){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите назавние группы или артиста для поиска песен:");
        String artist = in.nextLine();
        music_bank.search_song(artist);
    }

    static void delete(SongParserJSON music_bank){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите группу или артиста песню которой нужно удалить:");
        String artist = in.nextLine();

        List<JSONObject> song_list = music_bank.get_list_songs();

        List<JSONObject> f = song_list.stream()
                .filter(jsonObject -> artist.equalsIgnoreCase((String) jsonObject.get("artist"))).toList();

        Map<Integer, JSONObject> del_songs = new HashMap<>();

        for(int i =1; i<=f.size(); i++){
            del_songs.put(i, f.get(i-1));
            System.out.println(i + " " + f.get(i-1).get("title"));
        }

        System.out.println("Выберете песню для удаления, введите номер:");
        int n = in.nextInt();
        music_bank.delete_song(del_songs.get(n));
    }

    static void add(SongParserJSON music_bank){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название песни:");
        String title = in.nextLine();
        System.out.println("Введите исполнителя/группу:");
        String artist = in.nextLine();
        System.out.println("Введите название альбома:");
        String album = in.nextLine();
        System.out.println("Введите год выхода альбома или песни: ");
        int year = in.nextInt();
        music_bank.add_song(title, artist, album, year);
    }
}
