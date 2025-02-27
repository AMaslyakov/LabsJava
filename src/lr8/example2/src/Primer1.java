import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class Primer1 {

    public static void readAllByByte(InputStream input) throws IOException {
        while (true){
            int oneByte = input.read();
            if (oneByte != -1){
                System.out.print((char)oneByte);
            } else {
                System.out.print("\n" + " end");
                break;
            }
        }
    }

    public static void main(String[] args) {

        try {
            // File
            InputStream inputFile = new FileInputStream("./test.txt");
            readAllByByte(inputFile);
            System.out.println("============\n");
            inputFile.close();
            // Web page

//          InputStream webPage = new   URL("https://google.com").openStream();
            InputStream webPage = new URI("https://google.com").toURL().openStream();
            readAllByByte(webPage);
            System.out.println("===========\n");
            webPage.close();
            //ByteArray
            InputStream inputArray = new ByteArrayInputStream(new byte[] {7,9,3,7,4});
            readAllByByte(inputArray);
            System.out.println("==========\n");
            inputArray.close();
        }
        catch (IOException e){
            System.out.println("Ошибка " + e);
        } catch (URISyntaxException e) {
            System.out.println("Ошибка " + e);
            throw new RuntimeException(e);
        }
    }
}

