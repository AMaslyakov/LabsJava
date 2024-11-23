package src.lr1;

import java.util.Scanner;

public class example15_15 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите первое чило: ");
    int num1 = input.nextInt();
    System.out.print("Введите второе чило: ");
    int num2 = input.nextInt();
    System.out.printf(
        "Cумма чисел равна: %d\n",
        num1 + num2
        );

    input.close();
  }
}
