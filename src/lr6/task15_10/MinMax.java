package src.lr6.task15_10;

import java.util.Arrays;

public class MinMax {
    public static int[] getMinMax(int... args){
        int minimum = Arrays.stream(args).min().getAsInt();
        int maximum = Arrays.stream(args).max().getAsInt();
        return new int[]{minimum, maximum};
    }
}
