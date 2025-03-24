package src.lr11.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива:");
        int N = input.nextInt();
        int[] m = new int[N];
        for(int i = 0; i<N; i++){
            m[i] = random.nextInt(-100000, 100000 );
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(m));

        System.out.println("Массив только с четными числами:");
        System.out.println(Arrays.toString(filterEvenNumbers(m)));
    }

    public static int[] filterEvenNumbers(int[] numbers){
        return Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
    }}
