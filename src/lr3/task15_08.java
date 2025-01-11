package src.lr3;


public class task15_08 {

    public static boolean isVowel(char sym){
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y'};
        boolean r = false;
        for(char c: vowels){
            if (sym == c)
            {r = true;
             break;}
        }
        return r;}

    public static void main(String[] args) {

        int array_size = 10;
        char[] chars = new char[array_size];
        char start_char = 'A';
        for(int i = 0; i<chars.length; i++){
            if (!isVowel(start_char))
            {chars[i] = start_char;
             start_char += 1;}
            else{start_char +=1;
                --i;}
        }
        for (char  ch : chars){System.out.print(ch + " ");}
        System.out.println();
    }}