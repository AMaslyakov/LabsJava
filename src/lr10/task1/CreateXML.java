package src.lr10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXML {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();
            Element root = document.createElement("library");
            document.appendChild(root);

            Element book1 = document.createElement("book");
            root.appendChild(book1);

            Element title1 = document.createElement("title");
            title1.appendChild(document.createTextNode("Автостопом по галактике"));
            book1.appendChild(title1);

            Element author1 = document.createElement("author");
            author1.appendChild(document.createTextNode("Дуглас Адамс"));
            book1.appendChild(author1);

            Element year1 = document.createElement("year");
            year1.appendChild(document.createTextNode("1979"));
            book1.appendChild(year1);

            Element book2 = document.createElement("book");
            root.appendChild(book2);

            Element title2 = document.createElement("title");
            title2.appendChild(document.createTextNode("Цвет волшебства"));
            book2.appendChild(title2);

            Element author2 = document.createElement("author");
            author2.appendChild(document.createTextNode("Терри Пратчетт"));
            book2.appendChild(author2);

            Element year2 = document.createElement("year");
            year2.appendChild(document.createTextNode("1983"));
            book2.appendChild(year2);

            // Запись в файл

            document.setXmlStandalone(true);
            document.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/lr10/task1/books.xml"));
            transformer.transform(source, result);
            System.out.println("Файл успешно создан!");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
