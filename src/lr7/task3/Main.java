package src.lr7.task3;


public class Main {
    public static void main(String[] args) {
        SuperClass inst1;
        SubClass inst2;
        SubSubClass inst3;

        inst1 = new SuperClass(42);
        System.out.println("SuperClass\n========");
        System.out.println(inst1);
        inst1.setFields(2042);
        System.out.println(inst1);

        inst2 = new SubClass(24, 'a');
        System.out.println("SubClass\n========");
        System.out.println(inst2);
        inst2.setFields(42, 'b');
        System.out.println(inst2);

        inst3 = new SubSubClass(256, 'c', "FIELD");
        System.out.println("SubSubClass\n========");
        System.out.println(inst3);
        inst3.setFields(1024, 'o', "CHANGE");
        System.out.println(inst3);
    }
}
