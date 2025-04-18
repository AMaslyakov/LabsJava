package src.lr11.task9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Программирование",
                "Кодирование", "Алгоритм", "Массивы",
                "Функция#", "Цикл", "Переменная*7^",
                "Класс1209", "Класс342$", "Объект#1023",
                "Скрипт101", "Компиляция", "Интерпретатор",
                "Библиотека", "Модуль001", "Модуль003"
        );

        System.out.println("Исходный список строк:");
        strings.forEach(System.out::println);

        System.out.println();

        System.out.println("Строки состоящие только из букв:");
        List<String> onlyLetters = findOnlyLetters(strings);
        onlyLetters.forEach(System.out::println);
    }

    public static List<String> findOnlyLetters(List<String> list){
       return  list.stream().filter(s->{
           char[] a = s.toCharArray();
           for(char c: a) if(!Character.isLetter(c)) return false;
           return true;
       }).toList();}}
