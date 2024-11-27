package src.lr3;

import java.util.Scanner;

public class task15_04_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_num = input.nextInt();
        System.out.print("Введите второе число");
        int second_num = input.nextInt();

        int min_num = Math.min(first_num, second_num);
        int max_num = Math.max(first_num, second_num);

        do {
            System.out.println(min_num);
            min_num++;
        }
        while (min_num <= max_num);
    }
}