import java.util.Scanner;

public class example12 {
  public static int calc_age(int year_born) {
    int current_year = 2024;
    return current_year - year_born;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите год рождения:");
    int year_born = input.nextInt();
    int age; 
    age = calc_age(year_born);

    System.out.printf(
        "Возраст человека рожденного в %d году, %d лет\n",
        year_born, age
        );
  }
}
