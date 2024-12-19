package src.lr5.task15_05;

public class Main {
    public static void main(String[] args) {
        int arg;
        System.out.println("Конструктор без аргументов:");
        OneInteger oneintConstructor = new OneInteger();
        System.out.println("oneintConstructor.field= " + oneintConstructor.getField());

        arg = 42;
        System.out.println("Конструктор с аргументом arg=" + arg);
        OneInteger oneintConstructor2 = new OneInteger(arg);
        System.out.println("oneintConstructor2.field= " + oneintConstructor2.getField());

        arg = 346;
        System.out.println("Конструктор с аргументом arg=" + arg);
        OneInteger oneintConstructor3 = new OneInteger(arg);
        System.out.println("oneintConstructor2.field= " + oneintConstructor3.getField());

        arg = 45;
        OneInteger oneintMethod = new OneInteger(arg);
        System.out.println("Вызов метода без аргументов:");
        oneintMethod.setField();
        System.out.println("oneintMethod.field=" + oneintMethod.getField());

        arg = 23;
        System.out.println("Вызов метода с аргументом arg=" + arg);
        oneintMethod.setField(arg);
        System.out.println("oneintMethod.field=" + oneintMethod.getField());

        arg = 1234;
        System.out.println("Вызов метода с аргументом arg=" + arg);
        oneintMethod.setField(arg);
        System.out.println("oneintMethod.field=" + oneintMethod.getField());

    }
}
