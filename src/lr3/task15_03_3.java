package src.lr3;

import java.util.Scanner;

public class task15_03_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество чисел в ряду Фибоначи: ");
        int N = input.nextInt();
        int i = 1;
        int first = 1;
        int second = 1;
        while (i<N+1){
            if (N == 1 || i == 1){
                System.out.println(first);
                i++;
            } else if (N == 2 || i == 2) {
                System.out.println(second);
                i++;
            } else {
                int current = first + second;
                System.out.println(current);
                first = second;
                second = current;
                i++;
            }
        }
    }
}