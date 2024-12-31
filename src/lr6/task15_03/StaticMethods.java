package src.lr6.task15_03;

import java.util.Arrays;

public class StaticMethods {

    public static int max_value(int... args){
        return Arrays.stream(args).max().getAsInt();
    }

    public static int min_value(int... args){
        return Arrays.stream(args).min().getAsInt();
    }

    public static double avg_value(int... args){
        return Arrays.stream(args).average().getAsDouble();
    }
}
