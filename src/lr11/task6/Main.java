package src.lr11.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива:");
        int N = input.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for(int i= 0; i<N; i++){
            numbers.add(random.nextInt(1000));
        }

        System.out.println("Введите множитель для поиска кратных чисел.");
        int multiple = input.nextInt();

        System.out.println("Исходный список чисел:");
        numbers.forEach(n->System.out.print(n + " "));
        System.out.println();

        List<Integer> divisible_numbers = findDivisible(multiple, numbers);
        System.out.println("Числа кратные " + multiple + ":");
        divisible_numbers.forEach(n->System.out.print(n + " "));
    }

    public static  List<Integer> findDivisible(int multiple, List<Integer> numbers){
        return numbers.stream().filter(n->n%multiple==0).toList();
    }
}
