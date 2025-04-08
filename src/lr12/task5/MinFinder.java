package src.lr12.task5;

import java.util.Arrays;

public class MinFinder implements Runnable{

    private final Result result;
    private final int[] chunk;

    public MinFinder(int[]chunk, Result result) {
        this.result = result;
        this.chunk = chunk;
    }

    @Override
    public void run() {
        int value = Arrays.stream(this.chunk).min().orElseThrow(
                () -> new IllegalArgumentException("Список пустой"));
        System.out.println("Min value on thtread = " + value);
        this.result.minValue = value;
    }
}
