package src.lr13.task2.subtask1;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int N = input.nextInt();
        double average = calculateAverage(N);
        System.out.println("Среднее значение массива: " + average);
    }

    public static int[] getArray(int N) throws InputMismatchException {
        int[] result = new int[N];
        Scanner input = new Scanner(System.in);
        System.out.println("Вводите элементы массива:");
        for(int i=0; i<N; i++){
            result[i] = input.nextInt();
        }
        if (Arrays.stream(result).allMatch(e->e<0)){
            throw new ArrayStoreException("Не корректный ввод! Все элементы отрицательные!");
        }
        return result;}

    public static double calculateAverage(int N){
        int[] array = new int[N];
        try{
            array = getArray(N);
        } catch (InputMismatchException e){
            System.out.println("Не корректный вод, не соответствует int! Попробуйте заново!");
        } catch (ArrayStoreException e){
            System.out.println(e.getMessage());
        }
        return Arrays.stream(array).average().getAsDouble();
    }}
