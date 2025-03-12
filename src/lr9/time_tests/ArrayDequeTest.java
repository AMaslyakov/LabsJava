package src.lr9.time_tests;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.ResourceBundle;

public class ArrayDequeTest {
    static ArrayDeque<Integer> r_deque = new ArrayDeque<>();


    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("src.lr9.time_tests/data");
        String collection_size =bundle.getString("collection_size");
        int n = Integer.parseInt(collection_size);

        System.out.println("ADDING\n");

        long time_add_first = TestFunctions.timeAddFirstArrayDeque(n, new ArrayDeque<>());

        System.out.print("ArrayDeque & ");
        System.out.print(time_add_first + " &");

        long time_add_last = TestFunctions.timeAddLastArrayDeque(n, new ArrayDeque<>());

        System.out.print(" - & ");

        System.out.println(time_add_last);

        for(int i=0; i<n; i++){
            Random r = new Random();
            ArrayDequeTest.r_deque.add(r.nextInt());
        }


        System.out.println("\nREMOVING\n from ArrayDeque with size " + r_deque.size());

        long time_remove_first = TestFunctions.timeRemoveFirstArrayDeque(r_deque.clone());

        System.out.print("ArrayDeque & " +  time_remove_first);

        long time_remove_last = TestFunctions.timeRemoveLastArrayDeque(r_deque.clone());

        System.out.println(" & - & " + time_remove_last);
    }
}
