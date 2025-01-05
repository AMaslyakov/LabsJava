package src.lr6.task15_05;

public class Main {

    public static long checkSum(int n){
        if(n<0){
            return 0;
        }
        return (n*(n+1)*(2L *n+1))/6;
    }

    public static void main(String[] args) {
        int n1 = 5;
        long sumsquares = SumSquares.calculate(n1);
        long sumsquares_check = checkSum(n1);
        System.out.println("Сумма квадратов для " + n1 + " равна:\n" + sumsquares);
        System.out.println("Проверка формулой для  n = " + n1);
        System.out.println(sumsquares_check);
    }
}
