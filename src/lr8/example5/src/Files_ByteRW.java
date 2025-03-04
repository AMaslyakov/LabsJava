import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Files_ByteRW {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введите имя файла => ");
        String filename = input.nextLine();
        try{
            // Создается файл
            File f1=new File(filename);
            boolean r = f1.createNewFile();
            if(r) System.out.println("Полный путь файла:" + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int n=input.nextInt();
            DataOutputStream dOut = new DataOutputStream( new FileOutputStream(f1));
            input.nextLine();
            for (int i = 0; i < n; i++) {
                    System.out.print("Введите строку для записи в файл => ");
                    String s = input.nextLine();
                    dOut.writeUTF(s);
                    }
            dOut.flush();
            dOut.close(); // закрываем поток

            DataInputStream dIn=new DataInputStream(new FileInputStream(f1));
            while (true) {
                        System.out.println(dIn.readUTF());
                        }
        }catch (Exception e){
            System.out.println(""+e);
        }
    }
}
