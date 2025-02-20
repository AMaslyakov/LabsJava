package src.lr7.task4;

public class SubClass extends  SuperClass{

    public String field2;

    SubClass(SubClass arg) {
        super(arg);
        field2 = arg.field2;
    }

    SubClass(char arg1, String arg2){
        super(arg1);
        field2 = arg2;
    }
}
