package src.lr6.task15_05;

public class SumSquares {
    public static long calculate(int N){
        long sum = 0;
        if(N<0){
            System.out.println("Число должно быть больше нуля!");
            return sum;
        }
        for(int i=1; i<=N; i++){
            sum += i*i;}
        return sum;}
}