import java.io.*;

public class ConsonantsWords {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("consonants.txt")));
            int lineCount = 0;
            String line;
            while ((line = br.readLine())!=null){
                lineCount++;
                String[] words = line.split(" ");
                int startCountWithConsonant = 0;
                StringBuilder result = new StringBuilder();
                for(String word: words){
                    if(isConsonant(word.charAt(0))){
                        startCountWithConsonant++;
                        result.append(word);
                        result.append(" ");
                    }}
                bw.write(lineCount + "-" + startCountWithConsonant + ": " + result);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.print("Error!" + e.getMessage());
        }finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }

    private static boolean isConsonant(char c) {
        return !("аэоуыи".contains(String.valueOf(Character.toLowerCase(c))));
    }

}
