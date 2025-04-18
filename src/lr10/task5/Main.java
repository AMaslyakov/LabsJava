package src.lr10.task5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filepath = "src/lr10/task5/goods.xlsx";
        try{
        GoodsCartXLSX cart = new GoodsCartXLSX(filepath);
        cart.print_goods();}
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
