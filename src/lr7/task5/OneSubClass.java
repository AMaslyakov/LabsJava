package src.lr7.task5;

public class OneSubClass extends SuperClass {
    private int field2;

    OneSubClass(String arg1, int arg2) {
        super(arg1);
        field2 = arg2;
    }

    public void PrintData() {
        String className = this.getClass().getSimpleName();
        System.out.println("Class name: " +
                className + "\nПоле 1: " +
                this.getField1() + "\nПоле 2: "
                + field2 );
    }
}
