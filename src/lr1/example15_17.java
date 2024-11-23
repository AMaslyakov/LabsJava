package src.lr1;

import java.util.Scanner;

public class example15_17 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите первое чило, a: ");
    int a = input.nextInt();
    System.out.print("Введите второе чило, b: ");
    int b = input.nextInt();
    System.out.printf(
        "a + b = %d\na - b = %d\n",
        a + b, a - b
        );

    input.close();
  }
}
