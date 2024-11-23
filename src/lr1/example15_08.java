package src.lr1;

import java.util.Scanner;

public class example15_08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Введите свою фамилию: ");
    String surname = input.nextLine();

    System.out.print("введите своё имя: ");
    String name = input.nextLine();
    
    System.out.print("введите своё отчество: ");
    String patronymic_surname = input.nextLine();

    System.out.printf(
        "Hallo %s %s %s\n",
        surname, name, patronymic_surname
        );
  }
}
