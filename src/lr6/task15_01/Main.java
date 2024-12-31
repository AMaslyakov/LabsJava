package src.lr6.task15_01;

public class Main {
    public static void main(String[] args) {
        char symbol = 's';
        String text = "Some text Here";

        SymbolAndText instance = new SymbolAndText();

        instance.setFields(symbol);
        instance.setFields(text);

        instance.printSymbol();
        instance.printText();

        char[] many_symbols = {'L', 'i', 'n', 'e'};
        char[] one_symbol = {'1'};

        SymbolAndText instance2 = new SymbolAndText();

        instance2.setFields(one_symbol);
        instance2.printSymbol();
        instance2.setFields(many_symbols);
        instance2.printText();
    }
}
