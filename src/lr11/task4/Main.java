package src.lr11.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int N = 10;
        for(int i = 1; i<=N; i++){
            numbers.add(i);
        }

        System.out.println("Исходный список:");
        numbers.forEach(e->{
            System.out.print(e + " ");
        });

        System.out.println();
        System.out.println("Квадраты чисел:");

       List<Integer> squares = toSquare(numbers);
        squares.forEach(n->{
            System.out.print(n + " ");
        });
        System.out.println();
    }

    public static List<Integer> toSquare(List<Integer> numbers){
        return numbers.stream().map(n->{
            int r = n*n;
            return r;
        }).toList();
    }
}
