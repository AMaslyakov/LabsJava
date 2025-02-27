import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    public static void ReadAllByArray(InputStream input) throws IOException {
        byte[] buff = new byte[5];
        while (true){
            int count = input.read(buff);
            if(count != -1){
                System.out.println(
                    "Количество = " + count +
                    ", buff = " + Arrays.toString(buff) +
                    ", str = " + new String(buff, 0, count, StandardCharsets.UTF_8)
                );
            } else break;
        }
    }

    public static void main(String[] args) throws IOException {
        String filename = "test.txt";
        InputStream inFile = null;
        try{
            inFile = new FileInputStream(filename);
            ReadAllByArray(inFile);
        }
        catch (IOException e){
            System.out.println(
                    "Ошибка открытия/закрытия файла: " +
                      filename + " " + e);
        }
        finally {
            if(inFile != null){
            try{
               inFile.close();
            } catch (IOException ignore){
                /*NOP*/
            }
            }}}}
