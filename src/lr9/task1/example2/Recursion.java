package src.lr9.task1.example2;

public class Recursion {
    public static void m(int x){
        System.out.println("x=" + x);
        if((x - 1)/2 > 0){
            m((x - 1)/2);
        }
    }

    public static void main(String[] args) {
        m(15);
    }
}
