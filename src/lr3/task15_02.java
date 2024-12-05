package src.lr3;

import java.util.Scanner;

public class task15_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите название дня недели:");
        String week_day =  input.nextLine().toLowerCase();
        switch (week_day){
            case "понедельник":
                System.out.println(1);
                break;
            case "вторник":
                System.out.println(2);
                break;
            case "среда":
                System.out.println(3);
                break;
            case "четверг":
                System.out.println(4);
                break;
            case "пятница":
                System.out.println(5);
                break;
            case "суббота":
                System.out.println(6);
                break;
            case "воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Введен не существующий день недели!");
                break;
        }}}