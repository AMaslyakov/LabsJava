package src.lr6.task15_03;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        int min = StaticMethods.min_value(1, 2, 4, 5 , 8, -1);
        int max = StaticMethods.max_value(1,2,4,6,8,-1);
        double avg = StaticMethods.avg_value(1,2,4,6,8, -1);
        System.out.println("Результаты для: 1,2,5,6,8,-1:");
        System.out.println("min:" + min + " max:" + max + " avg:" + avg);
        int[] numbers = {45, 34, 546, 23};
        int min2 = StaticMethods.min_value(numbers);
        System.out.println("Для" + Arrays.toString(numbers)+ " min2:");
        System.out.println(min2);
    }
}
