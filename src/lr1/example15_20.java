package src.lr1;

import java.util.Scanner;

public class example15_20 {

    public static double a_pow_b(double a, double b){
        return Math.pow(a, b);
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