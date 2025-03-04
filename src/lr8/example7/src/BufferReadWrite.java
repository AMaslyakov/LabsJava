import java.io.*;

public class BufferReadWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter  bw = null;
        try{
            br = new BufferedReader(new FileReader("test_r.txt"), 1024);
            bw = new BufferedWriter(new FileWriter("test_w.txt"));
            int lineCount = 0;
            String line;
            while ((line = br.readLine()) != null){
                lineCount++;
                System.out.println("Line count: " + lineCount);
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }finally {
            br.close();
            bw.flush();
            bw.close();
        }

    }
}
