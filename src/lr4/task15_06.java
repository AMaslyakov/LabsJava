package src.lr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task15_06 {

    public static int[][] create_random_array(int M, int N){
        int[][] numbers = new int[M][N];
        Random random = new Random();
        for (int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                numbers[i][j] = random.nextInt(-1000,1000);
            }}
        return numbers;}

    public static int[][] remove_row_col(int[][] matrix){
        Random random = new Random();
        int r = random.nextInt(0, matrix.length);
        int c = random.nextInt(0, matrix[0].length);
        System.out.printf("Удалены строка: %d; столбец: %d\n",r, c);
        int[][] result = new int[matrix.length-1][matrix[0].length-1];

        int i = 0;
        int j = 0;
        for(int k=0; k<matrix.length; k++){
            if(k == r){continue;}
            for(int p=0; p<matrix[0].length; p++){
                if(p == c){continue;}
                result[i][j] = matrix[k][p];
                j++;
            }
            i++;
            j=0;
        }
        return result;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте кол-во строк массива: ");
        int M = input.nextInt();
        System.out.println("Задайте кол-во столбцов массива: ");
        int N = input.nextInt();
        int[][] matrix = create_random_array(M, N);
        System.out.println("Сгенерирован массив:");
        for(int[] row: matrix){System.out.println(Arrays.toString(row));}
        int[][] new_matrix = remove_row_col(matrix);
        System.out.println("Измененный массив:");
        for(int[] row: new_matrix){System.out.println(Arrays.toString(row));}
        }}