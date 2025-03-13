package src.lr10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXML {
    public static void main(String[] args) {
        try{
            File xmlfile = new File("src/lr10/task1/books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbFactory.newDocumentBuilder();
            Document document = db.parse(xmlfile);

            document.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());
            NodeList books = document.getElementsByTagName("book");
            for(int i = 0; i < books.getLength(); i++){
                Node node = books.item(i);
                System.out.println("Текущий элемент " + node.getNodeName());
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Название книги: " +
                            element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " +
                            element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " +
                            element.getElementsByTagName("year").item(0).getTextContent());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
