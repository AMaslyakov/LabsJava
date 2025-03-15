package src.lr10.task2;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        try {
            File file = new File("src/lr10/task2/songs.xml");
            SongsParserXML music_bank = new SongsParserXML(file);
            Scanner input = new Scanner(System.in);

            if(args.length == 0){
                music_bank.print_all_songs();
            }

            if(args.length ==1 && Objects.equals(args[0], "add")){
                System.out.println("Добавляем песню в библиотеку!");
                System.out.println("Введите название песни:");
                String title = input.nextLine();
                System.out.println("Введите исполнителя песни(группа/артист): ");
                String artist = input.nextLine();
                System.out.println("Введите альбом на котором выходила композиция: ");
                String album = input.nextLine();
                System.out.println("Введите год выхода альбома или песни: ");
                int year = input.nextInt();
                music_bank.add_song(title, artist, album, year);
            }

            if(args.length ==1 && Objects.equals(args[0], "search")){
                System.out.println("Введите артиста или группу поиска: ");
                String artist = input.nextLine();
                music_bank.print_find_song(artist);
            }

            if(args.length == 1 && Objects.equals(args[0], "del")){
                System.out.println("Введите имя исполнителя или группы, чью песню нужно удалить:");
                String artist = input.nextLine();
                List<Element> artist_songs = music_bank.search_song(artist);
                Iterator<Element> song_it = artist_songs.iterator();
                Map<Integer, Element> number_song = new HashMap<>();
                for(int i = 1; i<=artist_songs.size(); i++){
                    Element e = song_it.next();
                    number_song.put(i, e);
                    System.out.println(i + " " + e.getElementsByTagName("title").item(0).getTextContent());
                }
                System.out.println("Введите номер песни для удаления:");
                int num = input.nextInt();
                music_bank.delete_song(number_song.get(num));
            }


        } catch (IOException | ParserConfigurationException | SAXException e){
            System.out.println(e.getMessage());} catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
    }
