package lr6.task15_05;

public class Main {

    public static long checkSum(int n){
        if(n<0){
            return 0;
        }
        long sum = (n*(n+1)*(2*n+1))/6;
        return sum;
    };

    public static void main(String[] args) {
        int n1 = 5;
        long sumsquares1 = SumSquares.calculate(n1);
        long sumsquares1_check = checkSum(n1);
        System.out.println("Сумма квадратов для " + n1 + " равна:\n" + sumsquares1);
        System.out.println("Проверка формулой для  n = " + n1);
        System.out.println(sumsquares1_check);
    }
}
