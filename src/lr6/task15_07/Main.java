package src.lr6.task15_07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 't', '6', 'm', '7', ';'};
        int[] codes =  Symbols.toIntArray(chars);
        System.out.println("Коды символов " + Arrays.toString(chars) + ":");
        System.out.println(Arrays.toString(codes));
    }
}
