package src.lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class task15_10 {

    public static Integer[] create_random_array(int size){
        Integer[] numbers = new Integer[size];
        Random random = new Random();
        for (int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(100);
            System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
        }
        return numbers;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        int size = input.nextInt();
        System.out.printf("Размер массива равен %d\n", size);

        Integer[] numbers = create_random_array(size);
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Массив отсортирован в порядке убывания:");
        for (int number: numbers){
            System.out.print(number+ " ");
        }
        System.out.println();
    }
}
