package src.lr1;

import java.util.Scanner;

public class example15_19 {
  
    static double a =10.0, b=4.0, c;

    public static double hyp(double a, double b){
        return c = Math.sqrt(a*a + b*b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите катет, a: ");
        double a = input.nextDouble();
        System.out.print("Введите катет, b: ");
        double b = input.nextDouble();
        System.out.printf(
            "Гипотенуза равна: %.2f\n",
            hyp(a, b));
      }
  }

