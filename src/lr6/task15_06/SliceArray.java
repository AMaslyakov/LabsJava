package src.lr6.task15_06;

public class SliceArray {
    public static int[] cut(int[] array, int N){
        if(N > array.length){
            N = array.length;
        }
        int[] slice_array = new int[N];
        for(int i=0; i<N; i++){
            slice_array[i] = array[i];
        }
        return slice_array;
    }
}
