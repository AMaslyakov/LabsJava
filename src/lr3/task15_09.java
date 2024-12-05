package src.lr3;

import java.util.Random;
import java.util.Scanner;

public class task15_09 {

    public static int[] create_random_array(int size){
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(1000);
            System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
        }
        return numbers;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        int size = input.nextInt();
        System.out.printf("Размер массива равен %d\n", size);
        int[] numbers = create_random_array(size);
        int minValue = numbers[0];
        for (int n : numbers){
            if(n <= minValue)
            {minValue = n;}
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Имеет индекс/индексы:");
        for(int i=0; i<numbers.length; i++){
            if(minValue == numbers[i]){System.out.print(i + " ");}
        }}}
