package src.lr10.task3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SongParserJSON {
    private final JSONObject json;
    private static final String JSON_ROOT = "songs";
    private static final String JSON_TITLE = "title";
    private static final String JSON_ARTIST = "artist";
    private static final String JSON_ALBUM = "album";
    private static final String JSON_YEAR = "year";
    private final String filepath;

    SongParserJSON(String filepath) throws IOException, ParseException {
        this.filepath = filepath;
        json = parse(filepath);
    }

    private JSONObject parse(String filepath) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object o = parser.parse(new FileReader(filepath));
        return (JSONObject) o;
    }

    public void print_songs(){
        System.out.println("Root:" + json.keySet().iterator().next());
        JSONArray songs = (JSONArray) json.get(JSON_ROOT);
        for(Object o: songs){
            JSONObject song = (JSONObject) o;
            System.out.println("Песня: " + song.get(JSON_TITLE));
            System.out.println("  Исполнитель: " + song.get(JSON_ARTIST));
            System.out.println("  Альбом: " + song.get(JSON_ALBUM));
            System.out.println("  Год: " + song.get(JSON_YEAR));
        }
    }


    public void add_song(String title, String artist, String album, int year){

        JSONObject root = new JSONObject();

        JSONArray songs = (JSONArray) json.get(JSON_ROOT);

        JSONObject newSong = new JSONObject();
        newSong.put(JSON_TITLE, title);
        newSong.put(JSON_ARTIST, artist);
        newSong.put(JSON_ALBUM, album);
        newSong.put(JSON_YEAR, year);

        songs.add(newSong);
        root.put(JSON_ROOT, songs);

        try(FileWriter f = new FileWriter(filepath)) {
            f.write(root.toJSONString());
            System.out.println("Песня добавлена!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void search_song(String artist){
       JSONArray songs = (JSONArray) json.get(JSON_ROOT);
       List<JSONObject> song_list = new ArrayList<>();

       for(Object o: songs){
           JSONObject song = (JSONObject) o;
           song_list.add(song);
       }

       System.out.println("Все песни " +  artist.toUpperCase() + ":");
       song_list.stream()
               .filter(song-> artist.equalsIgnoreCase((String) song.get(JSON_ARTIST)))
               .forEach(s-> {
                   System.out.printf("%s\n", "-".repeat(15));
                   System.out.println("Песня: " + s.get(JSON_TITLE).toString());
                   System.out.println("  Альбом: " + s.get(JSON_ALBUM).toString());
                   System.out.println("  Год: " + s.get(JSON_YEAR).toString());
               });
    }


    public void delete_song(JSONObject jsonobject){
       JSONArray songs = (JSONArray) json.get(JSON_ROOT);
        Iterator iterator = songs.iterator();
        while (iterator.hasNext()){
            JSONObject song = (JSONObject) iterator.next();
            if(jsonobject.equals(song)){
                iterator.remove();
            }
        }
        JSONObject root = new JSONObject();
        root.put(JSON_ROOT, songs);

        try(FileWriter f = new FileWriter(filepath)) {
            f.write(root.toJSONString());
            System.out.println("Песня удалена!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public List<JSONObject> get_list_songs() {
        JSONArray songs = (JSONArray) json.get(JSON_ROOT);
        List<JSONObject> song_list = new ArrayList<>();

        for (Object o : songs) {
            JSONObject song = (JSONObject) o;
            song_list.add(song);
        }
        return song_list;
    }
}

