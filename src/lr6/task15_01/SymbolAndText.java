package src.lr6.task15_01;

public class SymbolAndText {
    private char symbol;
    private String text;

    public void setFields(char arg){
        symbol = arg;
    }

    public void setFields(String arg){
        text = arg;
    }

    public void setFields(char[] arg){
        if (arg.length == 1){
            symbol = arg[0];
        } else {
            text = new String(arg);
        }
    }

    public void printSymbol(){
        System.out.println("symbol:\n" + symbol);
    }

    public void printText(){
        System.out.println("text:\n" + text);}
}
