package src.lr5.task15_01;

public class Main {
    public static void main(String[] args) {
       Symbol symbol = new Symbol();
       symbol.setField('m');
       System.out.println("Код символа:");
       System.out.println(symbol.getField());
       System.out.println("Вызов метода класса Symbol");
       symbol.printInfo();
    }
}
