package src.lr6.task15_06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,57,56,2,31,12,34};
        int n1 = 3;
        int n2 = 7;
        int n3 = 10;
        int[] slice_array1 = SliceArray.cut(array, n1);
        int[] slice_array2 = SliceArray.cut(array, n2);
        int[] slice_array3 = SliceArray.cut(array, n3);
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));
        System.out.println(n1 + " элементов от исходного массива");
        System.out.println(Arrays.toString(slice_array1));
        System.out.println(n2 + " элементов от исходного массива");
        System.out.println(Arrays.toString(slice_array2));
        System.out.println(n3 + " элементов от исходного массива");
        System.out.println(Arrays.toString(slice_array3));
    }
}
