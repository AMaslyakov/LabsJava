package src.lr7.task3;

public class SubSubClass extends SubClass{
    public String field3;

    SubSubClass(int arg1, char arg2, String arg3) {
        super(arg1, arg2);
        field3 = arg3;
    }

    public void  setFields(int arg1, char arg2, String arg3){
        super.setFields(arg1, arg2);
        field3 = arg3;
    }
    public String toString(){
        String ClassName = this.getClass().getSimpleName();
        return String.format("Имя класс: %s\nПоле1: %d\nПоле2: %s\nПоле3: %s",
                ClassName, field, field2, field3);
    }
}
