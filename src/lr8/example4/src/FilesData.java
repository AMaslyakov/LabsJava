import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesData {
    public static void create_directory(String NameDir){
        File myDir = new File(NameDir);
        boolean r = myDir.mkdir();
        if(r){
            System.out.println("Папка " + NameDir + " создана");
        }
    }

    public static File create_file(String filename, String directory) throws IOException {
        Path p = Paths.get(directory);
        Path filePath = p.resolve(filename);
        File f = new File(String.valueOf(filePath));
        boolean r = f.createNewFile();
        if(r){
            System.out.println("Файл " + filePath + " создан");
        }
        return f;
    }

    public static void main(String[] args) throws IOException {
        String DIRECTORY = "My";
        String filename1 = "numIsh.txt";
        String filename2 = "numRez.txt";
        try {
            create_directory(DIRECTORY);
            File file1 = create_file(filename1, DIRECTORY);

            Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);

            DataOutputStream output = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath()));
            System.out.println("Введите количество чисел для записи:");
            int count = input.nextInt();
            for (int i = 0; i < count; i++) {
                output.writeFloat(input.nextFloat());
            }
            output.flush();
            output.close();

            File file2 = create_file(filename2, DIRECTORY);
            DataInputStream input_file = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
            output = new DataOutputStream(new FileOutputStream(file2.getAbsolutePath()));
            try {
                while (true) {
                    float number = input_file.readFloat();
                    output.writeFloat(number);
                    System.out.println("Переписано число: " + number);
                }
            } catch (EOFException e) {
                /*NOP*/
            }
            output.flush();
            output.close();
            input_file.close();
        } catch (IOException e){
            System.out.println("End of File");
        }
    }
}
