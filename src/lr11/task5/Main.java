package src.lr11.task5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String subsstring = "музыка";
        List<String> strings = List.of(
                "Музыка состоит из различных жанров.",
                "Существуют инструменты для создания музыки.",
                "Многие композиторы пишут симфонии.",
                "Звуки могут быть записаны на носителях.",
                "Музыкальные фестивали проходят в разных странах.",
                "Песни могут иметь разные темпы.",
                "Альбомы выпускаются раз в год.",
                "Музыка влияет на культуру общества.",
                "Звуковые волны воспринимаются ухом.",
                "Музыкальные ноты записываются на бумаге."
        );

        System.out.println("Поиск подстроки: " + subsstring);
        System.out.println("В строках:");
        strings.forEach(System.out::println);
        System.out.println();

        System.out.println("Найдены строки:");
        List<String> found_strings = findSubstring(subsstring, strings);
        found_strings.forEach(System.out::println);
    }

    public static List<String> findSubstring(String substring, List<String> list){
        return list.stream().filter(s-> s.toLowerCase()
                .contains(substring.toLowerCase())).toList();
    }}
