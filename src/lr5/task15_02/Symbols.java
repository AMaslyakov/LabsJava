package src.lr5.task15_02;

public class Symbols {
    public char symbol_1;
    public char symbol_2;

   public void printSymbols(){
       int code1 = (int) symbol_1;
       int code2 = (int) symbol_2;
       if (code1 < code2){
           char start =symbol_1;
           while(start != symbol_2 ){
               System.out.print(start + " ");
               start++;
           }
           System.out.print(symbol_2);
       } else if (code2 < code1) {
           char start = symbol_2;
           while (start != symbol_1) {
               System.out.print(start + " ");
                start++;
           }
           System.out.print(symbol_1);

       } else {
           System.out.print(symbol_1);
       }
       System.out.println();
   }
}
