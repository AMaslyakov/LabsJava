package src.lr9.task6;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 10;
        System.out.println("Введите строковые значения для ключей");
        HashMap<Integer, String> m =  createHashMap(N, input);
        for(int key: m.keySet()){
            if(key > 5) System.out.println("Key>5: " + key + " " + m.get(key));
        }
        for(int key: m.keySet()) {
            if(key == 0) System.out.println("Key = 0:" + m.get(key) + ",");
        }
        int r = 1;
        for(int key: m.keySet()){
            if(m.get(key).length() > 5 ) {
                r *= key;
            }
        }
        System.out.println("Произведение ключей с длинной > 5: " + r);
    }

    public static HashMap<Integer, String> createHashMap(int N, Scanner in) {
        HashMap<Integer, String> r = new HashMap<>();
        for (int i = 0; i < N; i++) {
            r.put(i, in.nextLine());
        }
        return r;
    }
    }

