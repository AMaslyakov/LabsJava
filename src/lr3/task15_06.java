package src.lr3;

import java.util.Scanner;

public class task15_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int N = input.nextInt();
        int[] numbers = new int[N];
        for (int i = 0;i<N; i++){
            System.out.println("Введите число:");
            int num = input.nextInt();
            if (num % 5 == 2){numbers[i] = num;}
            else{System.out.println("Число не соответствует критериям.");
                 System.out.println("Введите другое число!");
                 i--;}
            }
        System.out.println("Числа при делении на 5 дающие в остатке 2:");
        for(int number: numbers){System.out.print(number + " ");}
    }}