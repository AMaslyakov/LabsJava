package src.lr6.task15_08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test_array1 = {1, 6, 4, 10, 4, 56};
        double avg1 = Average.calculate(test_array1);
        System.out.println("Среднее значение чисел:" + Arrays.toString(test_array1));
        System.out.println(avg1);
        int[] test_array2 = {100, 100, 100, 100};
        double avg2 = Average.calculate(test_array2);
        System.out.println("Среднее значение чисел:" + Arrays.toString(test_array2));
        System.out.println(avg2);
    }
}

