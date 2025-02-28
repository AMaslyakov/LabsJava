package src.lr9.task7.example1;

import java.util.ArrayList;
import java.util.Scanner;

public class EverySecondArrayList {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество людей стоящих в кругу:");
        int N = input.nextInt();
        ArrayList<Integer> people = getList(N);
        int lastNumber = deleteEverySecond(people);
        System.out.println("Последний человек c номером: " + lastNumber);
    }


    public static ArrayList<Integer> getList(int N){
            ArrayList<Integer> count = new ArrayList<>();
            for(int i=1; i<=N; i++){
                count.add(i);
            }
            return count;
        }

        public static int deleteEverySecond(ArrayList<Integer> count){
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


