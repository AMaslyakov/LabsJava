package src.lr6.task15_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый запрос поля:");
        StaticField.getField();
        System.out.println("Второй запрос поля:");
        StaticField.getField();
        for(int i=3; i<=5; i++){
            System.out.println(i + "-й запрос поля:");
            StaticField.getField();
        }
    }
}
