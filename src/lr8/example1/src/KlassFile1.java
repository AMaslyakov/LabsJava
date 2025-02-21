import java.io.File;

public class KlassFile1 {
    public static void main(String[] args) {
        try{
            String FILENAME = "./test.txt";
            String NESTED_DIRS = "./texts/test/test";
            String OTHER_FILENAME = "./texts/test2.txt";
            File file = new File(FILENAME);
            boolean r = file.createNewFile();
            if(r) System.out.println("Создан фал:" + file.getAbsolutePath());

            File dirs = new File(NESTED_DIRS);
            boolean r2 = dirs.mkdirs();
            if(r2) System.out.println("Созданы папки:" + dirs.getAbsolutePath());

            File other_file = new File(OTHER_FILENAME);
            boolean r3 = other_file.createNewFile();
            if(r3) System.out.println("Создан файл:" + other_file.getAbsolutePath());

        }catch (Exception e){
            System.out.println("Ошибка" + e);
        }
    }
}
