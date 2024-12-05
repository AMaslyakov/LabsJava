package src.lr3;

public class task15_07 {

    public static void main(String[] args) {

        int array_size = 10;
        char[] chars = new char[array_size];
        char start_char = 'а';
        for(int i = 0; i<chars.length; i++){
            chars[i] = start_char;
            start_char += 2;
        }
        for (char ch: chars){System.out.print(ch + " ");}
        System.out.println();
        for(int i = chars.length - 1; i>-1; i-- ){
           System.out.print(chars[i] + " ");
        }}}