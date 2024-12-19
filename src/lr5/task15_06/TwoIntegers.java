package src.lr5.task15_06;

import java.util.Arrays;

public class TwoIntegers {
    private int min;
    private int max;

    TwoIntegers(int arg){
        if(arg <0){
            max=0;
            min=arg;
        } else {
            max=arg;
            min=0;
        }
    }

    TwoIntegers(int arg1, int arg2){
        if(arg1>arg2){
            max=arg1;
            min=arg2;
        } else {
            max=arg2;
            min=arg1;
        }
    }

    void setFields(int arg){
          int[] numbers = {min, max, arg};
          min = Arrays.stream(numbers).min().getAsInt();
          max = Arrays.stream(numbers).max().getAsInt();
    }

    void setFields(int arg1, int arg2){
        int[] numbers = {min, max, arg1, arg2};
        min = Arrays.stream(numbers).min().getAsInt();
        max = Arrays.stream(numbers).max().getAsInt();
    }

    void printFields(){
        System.out.println("min=" + min + " max=" + max);
    }
}
