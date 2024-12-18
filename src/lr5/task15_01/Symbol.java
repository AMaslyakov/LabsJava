package src.lr5.task15_01;

public class Symbol {
    private char field;

    public void setField(char value) {
        this.field = value;
    }

    public int getField(){
        return field;
    }

    public void printInfo(){
        int code = getField();
        System.out.println(" Symbol: " + field +" Code: " + code);
    }
}
