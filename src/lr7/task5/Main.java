package src.lr7.task5;

public class Main {
    public static void main(String[] args) {
        SuperClass inst1;
        OneSubClass inst2;
        TwoSubClass inst3;

        inst1 = new SuperClass("TEXT");
        inst1.printData();

        inst2 = new OneSubClass("OTHER_TEXT", 42);
        inst2.PrintData();

        inst3 = new TwoSubClass("SOME_TEXT", 'Y');
        inst3.PrintData();

        System.out.println("===========");

        SuperClass inst4 = new TwoSubClass("SUPER", 'u');
        inst4.printData();

        SuperClass inst5 = new OneSubClass("REPUS", 4200);
        inst5.printData();
        }
    }


