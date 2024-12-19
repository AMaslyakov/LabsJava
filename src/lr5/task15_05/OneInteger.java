package src.lr5.task15_05;

public class OneInteger {
    private int field;

    OneInteger(){
        field = 0;
    }

    OneInteger(int arg){
        if (isFieldLess100(arg)){
        field = arg;} else
        { field = 100;}
    }

    public void setField(){
        field = 0;
    }
    public void setField(int arg){
        if(isFieldLess100(arg)){
            field = arg;
        } else {
            field = 100;
        }
    }

    public int getField(){
        return field;
    }

    boolean isFieldLess100(int arg){
        return arg < 100;
    }

}
