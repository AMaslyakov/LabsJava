package src.lr7.task5;

public class SuperClass {
    private String field1;

    SuperClass(String arg){
        field1 = arg;
    }

    public String getField1(){
        return field1;
    }

    public void printData(){
        String className = this.getClass().getSimpleName();
        System.out.println("Class name: " + className + " Поле: " + this.field1);
    }
}
