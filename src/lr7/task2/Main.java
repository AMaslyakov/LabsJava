package src.lr7.task2;

public class Main {


    public static void main(String[] args) {
        SuperClass inst1 = new SuperClass("Some text");
        System.out.println("Длина строки inst1: " + inst1.getFieldLenght());
        inst1.setField("Other text");
        System.out.println("Длина строки: " + inst1.getFieldLenght());
        SubClass inst2 = new SubClass(10, "Some some text");
        System.out.println("Длина строки inst2: " + inst2.getFieldLenght());
        System.out.println("Целочисленное поле inst2: " + inst2.field);
    }
}
