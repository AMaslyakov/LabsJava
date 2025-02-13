package src.lr7.task2;

public class SubClass extends SuperClass {

    public int field;

    SubClass(int arg1, String arg2) {
        super(arg2);
        field = arg1;
    }

    public void setField(){
        field = 0;
    }

    public void setField(String arg){
        super.setField(arg);
    }

    public void setField(int arg){
        field = arg;
    }

    public void setField(int arg1, String arg2){
        field = arg1;
        super.setField(arg2);
    }
}
