package src.lr5.task15_04;

import java.text.DecimalFormat;

public class IntegerSymbol {
    public int number;
    public char symbol;

    IntegerSymbol(int N, char S){
        number = N;
        symbol = S;
    }

    IntegerSymbol(double D){
        int n = (int) D;
        symbol = (char) n;
        DecimalFormat df = new DecimalFormat("#.##");
        String frac = df.format(D - n).substring(2);
        if(frac.length() > 1){
            number = (int) Math.floor((D - n) * 100);
        }  else {
            number = Integer.parseInt(frac);
        }
    }
}
