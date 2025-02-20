package src.lr7.task4;

public class SuperClass {
    public char field1;

    SuperClass(SuperClass arg){
        field1 = arg.field1;
    }

    SuperClass(char arg){
        field1 = arg;
    }
}
