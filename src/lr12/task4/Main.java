package src.lr12.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Thread> tenThreads = new ArrayList<>();
        for(int i=1; i<=10; i++){
            int finalI = i;
            tenThreads.add(new Thread(()->{
                    Thread.currentThread().setName("Thread: " + String.valueOf(finalI));
                    System.out.println(Thread.currentThread().getName());
            }));
        }

        tenThreads.forEach(Thread::start);
    }
}
