package src.lr6.task15_04;

public class DoubleFactorial {

    public static long calc(int n){
        int result = 1;
        if(n % 2 == 0){
            for(int i = n; i>0; i-=2){
                result *= i;
            }
        }
        else{
            for(int i=n; i>0; i-=2){
                result *= i;
            }
        }
        return result;
    }
}
