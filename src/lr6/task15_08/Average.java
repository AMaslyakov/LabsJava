package src.lr6.task15_08;

import java.util.Arrays;

public class Average {
    public static double calculate(int[] numbers){
        int sum = Arrays.stream(numbers).sum();
        return (double) sum / numbers.length;
    }
}
