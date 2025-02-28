package src.lr9.task7.example2;

import java.util.LinkedList;
import java.util.Scanner;

public class EverySecondLinkedList {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    System.out.println("Введите количество людей стоящих в кругу:");
    int N = input.nextInt();
    LinkedList<Integer> people = getList(N);
    int lastNumber = deleteEverySecond(people);
        System.out.println("Последний человек c номером: " + lastNumber);
    }

    private static LinkedList<Integer> getList(int n) {
        LinkedList<Integer> count = new LinkedList<>();
        for(int i=1; i<=n; i++){
            count.add(i);
        }
        return count;
    }

    private static int deleteEverySecond(LinkedList<Integer> count) {
        int i=0;
        long start_time = System.currentTimeMillis();
        while(count.size() > 1){
            i = (i+1) % count.size();
            count.remove(i);
        }
        long end_time = System.currentTimeMillis();
        System.out.println(end_time-start_time + " мс.");
        return count.getFirst();

    }
}
