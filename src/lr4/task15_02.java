package src.lr4;

import java.util.Scanner;


public class task15_02 {

public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Введите катеты треугольника a = b = ");
    
    System.out.println();
    int a = input.nextInt();

    for(int i=0; i<a; i++){
      char[] chars = new char[i+1];
      for (int j = 0; j < chars.length; j++) {
        chars[j] = '#';
      }
      System.out.println(new String(chars)); 
    }
  }
}
