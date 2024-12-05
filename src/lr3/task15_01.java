package src.lr3;

import java.util.Scanner;

public class task15_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число дня недели:");
        int week_day_num = input.nextInt();

        switch (week_day_num){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка! Введите от 1 до 7.");
                break;
        }}}