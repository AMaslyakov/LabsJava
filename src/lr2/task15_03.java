package src.lr2;

import java.util.Scanner;

public class task15_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = input.nextInt();
        if (number % 4 == 0 && number >= 10){
            System.out.printf("Число %d соотвествует критериям!\n", number);
        } else {
            System.out.printf("Число %d не  соответсвует  критериям.\n", number);
        }
    }
}
