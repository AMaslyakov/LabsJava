package src.lr5.task15_06;

public class Main {
    public static void main(String[] args) {
        int arg;
        int arg2;
        arg = -23;
        System.out.println("Конструктор inst1 с arg=" + arg);
        TwoIntegers inst1 = new TwoIntegers(arg);
        inst1.printFields();
        arg=34;
        arg2=345;
        System.out.println("Конструктор inst2 с arg=" + arg + " и с  arg2=" + arg2);
        TwoIntegers inst2 = new TwoIntegers(arg, arg2);
        inst2.printFields();

        arg = 1;
        System.out.println("Устанавливаем  inst2.min inst2.max методом.");
        System.out.println("Метод с  arg=" + arg);
        inst2.setFields(arg);
        inst2.printFields();

        arg=21;
        arg2=-42;
        System.out.println("Метод с  arg=" + arg + " и с  arg2=" + arg2);
        inst2.setFields(arg, arg2);
        inst2.printFields();
    }
}
