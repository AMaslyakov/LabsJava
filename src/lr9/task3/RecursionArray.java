package src.lr9.task3;

import java.util.Scanner;

public class RecursionArray {
    public static void printArray(int[] array, int i){
        if(i < array.length){
            System.out.print(array[i] + " ");
            printArray(array, i+1);
        }
    }

    public static void fillArray(int[] array, int i, Scanner in){
        if(i < array.length){
            array[i] = in.nextInt();
            fillArray(array, i+1, in);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = input.nextInt();
        int[] a = new int[N];
        System.out.println("Введите элементы массива");
        fillArray(a, 0, input);
        System.out.println("Получен массив:");
        printArray(a, 0);
    }
}
