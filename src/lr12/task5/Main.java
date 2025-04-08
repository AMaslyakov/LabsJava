package src.lr12.task5;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

  private static int[] getArray(int N){
    int[] result = new int[N];
    Random r = new Random();
    for(int i=0; i<N; i++){
       result[i] = r.nextInt(1000000);
    }
    return result;
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите размер массива для поиска минимального числа.");
    int[] big_array = getArray(input.nextInt());
  System.out.println(Arrays.toString(big_array));

  System.out.println("Ядер на машине: " + defCpusNum());
  }

  private static int defCpusNum(){
    return Runtime.getRuntime().availableProcessors();
  }
}
