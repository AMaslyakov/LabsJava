package src.lr13.task1.example7;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException a) {
                System.out.println("2");}
        }
        System.out.println("3");}}
