package src.lr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task15_05 {

    public static int[][] create_random_array(int M, int N){
        int[][] numbers = new int[M][N];
        Random random = new Random();
        for (int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                numbers[i][j] = random.nextInt(-1000,1000);
            }}
        return numbers;}

    public static int[][] transpose(int[][] matrix){
        int M = matrix[0].length;
        int N = matrix.length;
        int[][] t_matrix = new int[M][N];
        for (int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                t_matrix[i][j] = matrix[j][i];
            }}
        return t_matrix;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте кол-во строк массива: ");
        int M = input.nextInt();
        System.out.println("Задайте кол-во столбцов массива: ");
        int N = input.nextInt();
        int[][] matrix = create_random_array(M, N);
        System.out.println("Сгенерирован массив:");
        for(int[] row: matrix){System.out.println(Arrays.toString(row));}
        int[][] t_matrix = transpose(matrix);
        System.out.println("Строки стали столбцами:");
        for(int[] row: t_matrix){System.out.println(Arrays.toString(row));}
        }}
