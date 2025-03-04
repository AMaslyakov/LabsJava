import java.io.*;
import java.nio.charset.StandardCharsets;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("test.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("test2.txt", StandardCharsets.UTF_8);
            int lineCount = 0;
            String line;
            while ((line = br.readLine()) != null){
                lineCount++;
                out.println(lineCount + ": "  + line);

            }

        }catch (IOException e){
            System.out.print("Ошибка" + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
