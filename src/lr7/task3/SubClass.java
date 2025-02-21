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

    public String toString(){
        String ClassName = this.getClass().getSimpleName();
        return String.format("Имя класс: %s\nПоле1: %d\nПоле2: %s",
                ClassName, field, field2);
    }
}
