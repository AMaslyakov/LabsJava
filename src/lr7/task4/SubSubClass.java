package src.lr7.task4;

public class SubSubClass extends SubClass{
    public int field3;

    SubSubClass(SubSubClass arg) {
        super(arg);
        field3 = arg.field3;
    }

    SubSubClass(char arg1, String arg2, int arg3){
        super(arg1, arg2);
        field3 = arg3;
    }

}
