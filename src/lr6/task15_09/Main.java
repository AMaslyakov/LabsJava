package src.lr6.task15_09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test_array1 = {1, 9, 2,  6, 8, 2};
        int[] test_array2 = {7, 42,  90, 81, 23};
        int[] res1 = Swapper.swapPairs(test_array1);
        System.out.println("Меняем пары для " + Arrays.toString(test_array1));
        System.out.println(Arrays.toString(res1));
        int[] res2 = Swapper.swapPairs(test_array2);
        System.out.println("Меняем пары для " + Arrays.toString(test_array2));
        System.out.println(Arrays.toString(res2));
    }
}
