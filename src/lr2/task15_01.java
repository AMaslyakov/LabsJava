package src.lr2;

import java.util.Scanner;

public class task15_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = input.nextInt();
        if (number % 3 == 0){
            System.out.printf("Число %d делиться на 3!\n", number);
        } else {
            System.out.printf("Число %d не делиться на 3.\n", number);
        }
    }
}
