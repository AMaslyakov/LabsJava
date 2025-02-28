package src.lr9.task2;

import java.util.Scanner;

public class IntToBinary {

    public static String  toBinary(int n){
        if(n == 0){
            return  "";
        } else  {
            return toBinary(n / 2 ) + n % 2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичное представление:");
        int N = input.nextInt();
        System.out.println(toBinary(N));
    }
}
