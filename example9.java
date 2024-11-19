import java.util.Scanner;

public class example9 {

  public static void main(String[] args) {
    
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter yor name, please:");
  String name = input.nextLine();
  System.out.println("And yor age?");
  int age = input.nextInt();

  System.out.printf("Your name is: %s\nYour age is: %d\n", name, age);

  }
}
