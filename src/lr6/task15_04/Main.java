package src.lr6.task15_04;

public class Main {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 6;
        int n3 = -3;
        long df1 = DoubleFactorial.calc(n1);
        long df2 = DoubleFactorial.calc(n2);
        long df3 = DoubleFactorial.calc(n3);
        System.out.println("Двойной факториал для " + n1 + ":\n" + df1);
        System.out.println("Двойной факториал для " + n2 + ":\n" + df2);
        System.out.println("Двойной факториал для " + n3 + ":\n" + df3);
    }
}
