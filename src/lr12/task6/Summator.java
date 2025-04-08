package src.lr12.task6;

import java.util.Arrays;

public class Summator implements Runnable{

    private final Result result;
    private final long[] chunk;

    public Summator(long[]chunk, Result result) {
        this.result = result;
        this.chunk = chunk;
    }

    @Override
    public void run() {
        long value = Arrays.stream(this.chunk).reduce(Long::sum).getAsLong();
        System.out.println("Cумма значений потока:" + value);
        this.result.sumValue = value;
    }
}
