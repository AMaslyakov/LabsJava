package src.lr11.task8;

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
        for(int i= 0; i<N; i++) numbers.add(random.nextInt(0, 100));

        System.out.println("Найти все числа больше чем(введите число):");
        int threshold = input.nextInt();

        List<Integer> foundNumbers = findNumbersMoreThen(threshold, numbers);
        System.out.println("Исходный список:");
        numbers.forEach(n->System.out.print(n + " "));
        System.out.println();

        System.out.println("Список с числами больше " + threshold);
        foundNumbers.forEach(n->System.out.print(n + " "));
        System.out.println();
    }

    public static List<Integer> findNumbersMoreThen(int threshold, List<Integer> numbers){
        return numbers.stream().filter(n->n>threshold).toList();
    }}
