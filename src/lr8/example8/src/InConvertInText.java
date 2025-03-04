import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class InConvertInText {
    public static void readAllByByte(Reader in)throws IOException {
       while (true) {
        int oneByte = in.read();
        if (oneByte != -1) {
            System.out.print((char) oneByte);
        } else {
            System.out.print("\n" + " конец ");
        break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("test.txt");
            Reader readFile = new InputStreamReader(inFile, StandardCharsets.UTF_8);
            readAllByByte(readFile);
            System.out.print("\n\n\n");
            inFile.close();
            readFile.close();

            InputStream inUrl = new URI("https://google.com").toURL().openStream();
            Reader readUrl = new InputStreamReader(inUrl, StandardCharsets.UTF_8);
            readAllByByte(readUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            readUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {85, 114,  97, 33});
            Reader readArray = new InputStreamReader(inArray, StandardCharsets.UTF_8);
            readAllByByte(readArray);
            System.out.print("\n\n\n");
            inArray.close();
            readArray.close();

        } catch (IOException e) {
            System.out.print("Ошибка!" + e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
