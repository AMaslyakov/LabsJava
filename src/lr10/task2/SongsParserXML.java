package src.lr10.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SongsParserXML {

    private final String NODE_SONG = "song";
    private final String NODE_TITLE = "title";
    private final String NODE_ARTIST = "artist";
    private final String NODE_ALBUM = "album";
    private final String NODE_YEAR = "year";
    private Document document;
    private String filepath;
    private File xmlfile;

    SongsParserXML(File file) throws ParserConfigurationException, IOException, SAXException {
        filepath = file.getAbsolutePath();
        document = create_document(file);
        xmlfile = file;
    }

    private Document create_document(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbFactory.newDocumentBuilder();
        return db.parse(file);
    }

    private List<Node> get_list_songs(){
        NodeList nodes = get_songs();
        ArrayList<Node> songs = new ArrayList<>();
        for(int i =0; i<nodes.getLength(); i++){
            songs.add(nodes.item(i));
        }
        return songs;
    }

    private NodeList get_songs(){
        return document.getElementsByTagName("song");
    }

    public void print_all_songs(){
        NodeList songs = get_songs();
        for(int i=0; i < songs.getLength(); i++){
            Node node = songs.item(i);
          if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) node;
                    System.out.printf("Песня: %s\n  Исполнитель: %s\n  Альбом: %s\n  Год: %s\n\n",
                      e.getElementsByTagName(NODE_TITLE).item(0).getTextContent(),
                      e.getElementsByTagName(NODE_ARTIST).item(0).getTextContent(),
                      e.getElementsByTagName(NODE_ALBUM).item(0).getTextContent(),
                      e.getElementsByTagName(NODE_YEAR).item(0).getTextContent()
              );
                }
            }
    }

    public void add_song(String title, String artist, String album, int year) throws TransformerException {
        System.out.println(title + artist + album + year);

        Element song = document.createElement(NODE_SONG);

        Element node_title = document.createElement(NODE_TITLE);
        node_title.appendChild(document.createTextNode(title));
        song.appendChild(node_title);

        Element node_artist = document.createElement(NODE_ARTIST);
        node_artist.appendChild(document.createTextNode(artist));
        song.appendChild(node_artist);

        Element node_album = document.createElement(NODE_ALBUM);
        node_album.appendChild(document.createTextNode(album));
        song.appendChild(node_album);

        Element node_year = document.createElement(NODE_YEAR);
        node_year.appendChild(document.createTextNode(String.valueOf(year)));
        song.appendChild(node_year);

        document.getDocumentElement().normalize();
        Element library = document.getDocumentElement();
        library.appendChild(song);

        Transformer transformer = TransformerFactory.newInstance().newTransformer(
                new StreamSource(new File("src/lr10/task2/style.xslt"))
        );

        document.setXmlStandalone(true);
        document.getDocumentElement().normalize();

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);

        System.out.println("Song added successfully!");
    }

    public List<Element> search_song(String artist){
        List<Node> songs = get_list_songs();
        return songs.stream()
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> {
                    String node_title = element.getElementsByTagName(NODE_ARTIST).item(0).getTextContent();
                    return node_title.equalsIgnoreCase(artist);
                }).toList();}

    public void print_find_song(String artist){
        List<Element> find_songs = search_song(artist);
        for(Element e: find_songs){
          if(e.getNodeType() == Node.ELEMENT_NODE){
              System.out.printf("Песня: %s\n  Исполнитель: %s\n  Альбом: %s\n  Год: %s\n",
                      e.getElementsByTagName(NODE_TITLE).item(0).getTextContent(),
                      e.getElementsByTagName(NODE_ARTIST).item(0).getTextContent(),
                      e.getElementsByTagName(NODE_ALBUM).item(0).getTextContent(),
                      e.getElementsByTagName(NODE_YEAR).item(0).getTextContent()
              );
          }
        }
    }

    public void delete_song(Element song) throws TransformerException {
       Element root = document.getDocumentElement();
       root.removeChild(song);

        Transformer transformer = TransformerFactory.newInstance().newTransformer(
                new StreamSource(new File("src/lr10/task2/style.xslt"))
        );

        document.setXmlStandalone(true);
        document.getDocumentElement().normalize();

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(filepath));
        transformer.transform(source, result);

        System.out.println("Song remove successfully!");

    }

}
