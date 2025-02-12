package src.lr7.task1;

public class Main {
    public static void main(String[] args) {
        SubClass inst = new SubClass("Поле");
        System.out.println(inst);
        SubClass inst2 = new SubClass("One", "Two");
        System.out.println(inst2);
        SuperClass inst3 = new SuperClass("FIELD");
        System.out.println(inst3);
    }
}
