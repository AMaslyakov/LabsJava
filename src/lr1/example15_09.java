package src.lr1;

import java.util.Scanner;

public class example15_09 {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Пожайлуста, введите имя:");
  String name = input.nextLine();
  System.out.println("И введите возраст");
  int age = input.nextInt();

  System.out.printf(
      "Ваше имя: %s\nВаш возраст: %d\n",
      name, age);
  }
}
