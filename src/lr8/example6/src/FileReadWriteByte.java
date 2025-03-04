import java.io.*;

public class FileReadWriteByte {
    public static void main(String[] args) throws IOException {
        try (Reader in = new FileReader("test_r.txt"); Writer out = new FileWriter("test_w.txt",
                true)) {
            int oneByte;
            while ((oneByte = in.read()) != -1) {
//                     out.write((char)oneByte);
                out.append((char) oneByte);
                System.out.println((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println(" " + e);
        }
    }
}
