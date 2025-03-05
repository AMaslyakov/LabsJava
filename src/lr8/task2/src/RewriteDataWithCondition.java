import java.io.*;

public class RewriteDataWithCondition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("source.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("result.txt")));
            int lineCount = 0;
            String line;
            while ((line = br.readLine())!= null){
                lineCount++;
                if(lineCount == 2){
                    bw.write(line);
                    bw.newLine();
                }
                if(lineCount == 3){
                    String[] doubles = line.split(" ");
                    StringBuilder result = new StringBuilder();
                    for (String digit: doubles){
                        double d = Double.parseDouble(digit);
                        if(d > 0){
                            result.append(digit);
                            result.append(" ");
                        }
                    }
                    bw.write(result.toString());
                    bw.newLine();
                }

            }
        }catch (IOException e){
            System.out.print("Ошибка!" + e);
        }finally {
            br.close();
            bw.flush();
            bw.close();}}}
