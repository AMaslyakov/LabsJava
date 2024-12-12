package src.lr4;

import java.util.Scanner;

public class task15_04 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите  катет прямоугольного треугольник a = b = ");
    System.out.println();
    int a = input.nextInt();
    char[][] triangle = new char[a][a];
    for(int i=0; i < triangle.length; i++){
        for(int j=0; j<triangle[i].length; j++){
            if(j<=i){
                triangle[i][j] = '#';
            } else { triangle[i][j] = ' ';}
        }}
    for(char[] line: triangle){System.out.println(line);
    }}}