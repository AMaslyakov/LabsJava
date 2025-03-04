import java.io.*;
import java.nio.charset.StandardCharsets;

public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("test.txt"), StandardCharsets.UTF_8));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("test_w.txt"), StandardCharsets.UTF_8));
            int lineCount = 0;
            String line;
            while ((line = br.readLine())!=null){
                lineCount++;
                System.out.println(lineCount + ": " + line);
                bw.write(lineCount + ": " + line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.print("Ошибка!");
        }finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
