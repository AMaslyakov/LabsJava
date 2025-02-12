package src.lr7.task1;

public class SuperClass {
    private String field;


    SuperClass(String arg) {
        field = arg;
    }

    public String getField(){
        return field;
    }

    public String toString(){
        String name = this.getClass().getSimpleName();
        return String.format("Поле класса: %s\nИмя класса: %s", field, name);
    }

}
