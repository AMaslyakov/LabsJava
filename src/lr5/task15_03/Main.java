package src.lr5.task15_03;

public class Main {

    public static void main(String[] args) {
        TwoIntegers noargs = new TwoIntegers();
        System.out.println( noargs.one + " " +  noargs.two);
        TwoIntegers oneargs = new TwoIntegers(100);
        System.out.println( oneargs.one + " " +  oneargs.two);
        TwoIntegers twoargs = new TwoIntegers(42, 114);
        System.out.println( twoargs.one + " " +  twoargs.two);
    }
}

