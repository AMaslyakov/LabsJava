package src.lr1;

import java.util.Scanner;

public class example15_10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Какой сегодня день недели?");
    String weekday = input.next();
    System.out.println("Какой сегодня месяц?");
    String month = input.next();
    System.out.println("Какой сегодня день месяца?");
    int monthday = input.nextInt();

    System.out.printf(
        "Сегодня: %s %d %s\n",
        weekday, monthday, month
        );
  }
}
