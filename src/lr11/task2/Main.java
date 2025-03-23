package src.lr11.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массивов:");
        int N = input.nextInt();
        int[] m1 = new int[N];
        int[] m2 = new int[N];
        Random random = new Random();
        for(int i =0; i<N; i++){
            m1[i] = random.nextInt(100);
            m2[i] = random.nextInt(100);
        }

        System.out.println("Исходные массиввы:");

        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));

        System.out.println("Пересечение массивов:");

        System.out.println(Arrays.toString(filterIntersectionFrom(m1, m2)));
    }

    public static int[] filterIntersectionFrom(int[] arr1, int[] arr2){
        return Arrays.stream(arr1).filter(
                    e-> Arrays.stream(arr2).anyMatch(e2->e2==e)
                ).toArray();
    }
}
