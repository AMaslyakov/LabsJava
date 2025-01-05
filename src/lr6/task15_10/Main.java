package src.lr6.task15_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] res1 = MinMax.getMinMax(1, 2, 56, 8, 4, 67, 6);
        System.out.println("Произвольное количество аргументов 1, 2, 56, 8, 4, 67, 6");
        System.out.println(Arrays.toString(res1));
        int[] test_array = {11, 43, 67, 12 ,56 ,78 , -12};
        int[] res2 = MinMax.getMinMax(test_array);
        System.out.println("Аргумент как массив " + Arrays.toString(test_array));
        System.out.println(Arrays.toString(res2));
    }
}
