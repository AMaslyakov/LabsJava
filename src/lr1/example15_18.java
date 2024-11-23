package src.lr1;

import java.util.Scanner;

public class example15_18 {

    public static double hyp(double a, double b){
        return Math.sqrt(a*a + b*b);
    }

    public static double a_pow_b(double a, double b){
      return Math.exp(b*Math.log(a));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите катет, a: ");
        double a = input.nextDouble();
        System.out.print("Введите катет, b: ");
        double b = input.nextDouble();
        System.out.printf(
            "a^b=%.2f\n",
            a_pow_b(a, b));
      }
  }

