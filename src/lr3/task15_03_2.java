package src.lr3;

import java.util.Scanner;

public class task15_03_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество чисел в ряду Фибоначи: ");
        int N = input.nextInt();
        long[] series = new long[N];
        int i = 0;
        while(i < N){
            if (i == 0 || i == 1){series[i] = 1;}
            else{series[i] = series[i-1] + series[i-2];}
            System.out.printf("%d\n", series[i]);
            i++;
        }}}