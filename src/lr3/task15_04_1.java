package src.lr3;

import java.util.Scanner;

public class task15_04_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_num = input.nextInt();
        System.out.print("Введите второе число");
        int second_num = input.nextInt();

        int min_num = Math.min(first_num, second_num);
        int max_num = Math.max(first_num, second_num);
        for (int n = min_num;  n < max_num +1; n++){
            System.out.println(n);
            }}}