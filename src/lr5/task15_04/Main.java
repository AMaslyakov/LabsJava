package src.lr5.task15_04;

public class Main {
    public static void main(String[] args) {
        IntegerSymbol twoArgs = new IntegerSymbol(12, 'h');
        System.out.println("number: " + twoArgs.number + " symbol: " + twoArgs.symbol);
        IntegerSymbol doubleArg1 = new IntegerSymbol(65.1);
        System.out.println("number: " + doubleArg1.number + " symbol: " + doubleArg1.symbol);
        IntegerSymbol doubleArg2 = new IntegerSymbol(66.1);
        System.out.println("number: " + doubleArg2.number + " symbol: " + doubleArg2.symbol);
        IntegerSymbol doubleArg3 = new IntegerSymbol(4242.428345);
        System.out.println("number: " + doubleArg3.number + " symbol: " + doubleArg3.symbol);
    }
}
