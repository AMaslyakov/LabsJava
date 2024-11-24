package src.lr2;

import java.util.Scanner;

public class task15_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = input.nextInt();
        int thousands = number / 1000;

        System.out.printf("В данном числе %d тысяч\n", thousands);
           }
}
