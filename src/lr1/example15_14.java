package src.lr1;

import java.util.Scanner;

public class example15_14 {
  public static int calc_year_born(int age) {
    int current_year = 2024;
    return current_year - age;}

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите возраст:");
    int age = input.nextInt();
    int year_born; 
    year_born = calc_year_born(age);
    System.out.printf("Год рождения: %d\n", year_born);
  }}
