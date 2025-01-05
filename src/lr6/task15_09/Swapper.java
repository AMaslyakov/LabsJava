package src.lr6.task15_09;

public class Swapper {
    public static int[] swapPairs(int[] numbers){
        int[] result = new int[numbers.length];
            for (int i=0; i<(numbers.length/2)+1;i++){
                result[i] = numbers[numbers.length - (i+1)];
                result[numbers.length-(i+1)] = numbers[i];
            }
        return result;
    }
}
