package src.lr1;

import java.util.Scanner;

public class example15_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите название месяца:");
    String month = input.next();
    System.out.println("Введите количество дней в этом месяце:");
    int month_days = input.nextInt();
    System.out.printf("В %s %d дней!\n", month, month_days);    
  }
}

