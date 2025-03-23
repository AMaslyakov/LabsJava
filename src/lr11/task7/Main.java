package src.lr11.task7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int min_length = 35;
        List<String> strings = List.of(
                "Космос состоит из звезд.",
                "Солнце — центральная звезда.",
                "Галактики содержат миллиарды звезд.",
                "Чёрные дыры обладают гравитацией.",
                "Космические миссии исследуют планеты.",
                "Астрономы изучают свет объектов.",
                "Существуют экзопланеты за пределами.",
                "Космические телескопы наблюдают Вселенную.",
                "Свет от звезд путешествует долго.",
                "Космос полон загадок и открытий.",
                "Кометы.",
                "Планеты.",
                "Метеоры.",
                "Сатурн.",
                "Астероиды."
        );

        System.out.println("Исходный список:");
        strings.forEach(System.out::println);
        System.out.println();

        List<String> found_strings = findLengthMoreThen(min_length, strings);
        System.out.println("Строки длинной больше" + min_length + ":");
        found_strings.forEach(System.out::println);
    }

    public static List<String> findLengthMoreThen(int length, List<String> list){
        return list.stream().filter(s->s.length()>length).toList();
    }
}
