package src.lr4;

import java.util.Scanner;

public class task15_08 {

    static String encrypt(String text, int key){
        char[] symbols = text.toCharArray();
        for(int i=0; i<symbols.length; i++){
            symbols[i] += key;
        }
        return new String(symbols);
    }

    static String decrypt(String enc_text, int key){
        char[] symbols = enc_text.toCharArray();
        for(int i=0; i<symbols.length; i++){
            symbols[i] -= key;
        }
        return new String(symbols);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = input.nextLine();
        System.out.println("Введите ключ:");
        int key = input.nextInt();
        String encrypted_text = encrypt(text, key);
        System.out.println("Зашифрованный текст:");
        System.out.println(encrypted_text);
        System.out.println("Выполнить обратное преобразование? y/n");
        String answer = input.next();
        while (true){
            if(answer.equals("y")){
                System.out.println(decrypt(encrypted_text, key));
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ (y/n)");
                System.out.println("Выполнить обратное преобразование? ");
                answer = input.next();
            }
        }
    }
}
