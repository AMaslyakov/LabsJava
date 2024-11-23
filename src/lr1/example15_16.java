package src.lr1;

import java.util.Scanner;

public class example15_16 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите чиcло: ");
    int num2 = input.nextInt();
    int num1 = num2 - 1;
    int num3 = num2 + 1;
    int tmp = num1 + num2 +num3;
    int num4 = tmp * tmp;

    System.out.printf(
        "%d\n%d\n%d\n%d\n",
        num1, num2, num3, num4
        );

    input.close();
  }
}
