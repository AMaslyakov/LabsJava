package src.lr5.task15_02;

public class Symbols {
    public char one;
    public char two;

   public void printSymbols(){
       int code1 = one;
       int code2 = two;
       if (code1 < code2){
           char start = one;
           while(start != two){
               System.out.print(start + " ");
               start++;
           }
           System.out.print(two);
       } else if (code2 < code1) {
           char start = two;
           while (start != one) {
               System.out.print(start + " ");
                start++;
           }
           System.out.print(one);

       } else {
           System.out.print(one);
       }
       System.out.println();
   }
}
