package src.lr3;

import java.util.Scanner;

public class task15_05_1 {

    public static int sum(int[] numbers){
        int sum = 0;
        for (int number : numbers) {sum += number;}
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество суммируемых чисел: ");
        int N = input.nextInt();
        int[] numbers = new int[N];
        int i = 0;
        while (i<N){
            System.out.println("Введите число:");
            int num = input.nextInt();
            if (num % 5 == 2 || num % 3 == 1)
            {numbers[i] = num;
             i++; }
            else { System.out.println("Число не соответствует критериям.");
                   System.out.println("Введите другое число!");}
            }
        int sum_of_numbers = sum(numbers);
        System.out.println("Числа удовлетворяющие критериям:");
        for(int number: numbers){System.out.print(number + " ");}
        System.out.println();
        System.out.printf("Сумма чисел равна: %d", sum_of_numbers);
    }}