package src.lr6.task15_07;


public class Symbols {
    public static int[] toIntArray(char[] symbols){
        int[] result = new int[symbols.length];
        for(int i=0; i<symbols.length; i++){
            result[i]=symbols[i];
        }
        return result;
    }
}
