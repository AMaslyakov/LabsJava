package src.lr9.task1.example4;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    public static int fact(int n){
        int result;
        if(n == 1) return 1;
        else {
            result = fact(n-1) * n;
            return result;
        }
    }
}
