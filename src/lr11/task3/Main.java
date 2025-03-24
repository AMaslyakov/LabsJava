package src.lr11.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String some_text = "В мрачном и величественном мире, где древние чудовища" +
          " пробуждаются от векового сна, а огненные демоны угрожают уничтожить" +
          " всё живое, один Герой встает на защиту своего народа. Это история о борьбе," +
          " о смелости и о судьбе, которая переплетает жизни миллионов.\n" +
          "В сердце северных земель, где снежные вершины касаются небес, " +
          "раскинулась империя, охваченная хаосом. Власть королей пошатнулась, " +
          "а тьма окутала земли, когда на горизонте появились зловещие знамения. " +
          "Древние пророчества, забытые в веках, вновь обрели силу, и только один " +
          "Герой способен изменить ход истории.";

        List<String> list = List.of(some_text.split(" "));
        list.forEach(System.out::println);

        List<String> onlyUpper  = onlyUpperCaseString(list);

        System.out.println("Строки только с большой буквы:");
        onlyUpper.forEach(System.out::println);}

    public static List<String> onlyUpperCaseString(List<String> list){
        return list.stream().filter(s -> {
            return Character.isUpperCase(s.charAt(0));
    }).toList();}}
