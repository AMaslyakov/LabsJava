package src.lr7.task3;

public class SuperClass {
    public int field;

    SuperClass(int arg){
        field = arg;
    }

    public void setFields(int arg){
        field = arg;
    }

    public String toString(){
        String ClassName = this.getClass().getSimpleName();
        return String.format("Имя класс: %s\nПоле1: %d", ClassName, field);
    }
}
