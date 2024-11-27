package src.lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task15_09 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Задайте размер массива:");
    int size = input.nextInt();
    System.out.printf(
            "Размер массива равен %d\n",
            size
        );
    int[] numbers = new int[size];
    Random random = new Random();

    for(int i=0; i<numbers.length; i++){
        numbers[i] = random.nextInt();
        System.out.printf(
                "Элемент № %d массива равен: %d\n",
                i, numbers[i]);
        }

    Arrays.sort(numbers);
    System.out.println("Массив отсортирован");
    for(int i=0; i<numbers.length;i++ ){
        System.out.printf(
                "Элемент № %d: %d\n",
                i, numbers[i]);
        }
    }
}
