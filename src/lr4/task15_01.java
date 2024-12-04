package src.lr4;


public class task15_01 {

    private static int width = 23;
    private static int height = 11;
    private static char filler = '#';

    public static void main(String[] args) {
     char[] chars = new char[width];
     for(int i=0; i <chars.length; i++){
       chars[i] = filler;
     }
    String line = new String(chars);

    for (int i = 0; i < height; i++) {
      System.out.println(line);
    }
    }
}
