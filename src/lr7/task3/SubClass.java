package src.lr7.task3;

public class SubClass extends SuperClass {

    public char field2;

    SubClass(int arg1, char arg2){
        super(arg1);
        field2 = arg2;
    }

    public void setFields(int arg1, char arg2){
        field2 = arg2;
        super.setFields(arg1);
    }
}
