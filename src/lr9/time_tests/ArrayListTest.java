package src.lr9.time_tests;

import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class ArrayListTest {
    static ArrayList<Integer> r_list = new ArrayList<>();


    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("src.lr9.time_tests/data");
        String collection_size =bundle.getString("collection_size");
        int n = Integer.parseInt(collection_size);

        System.out.println("ADDING\n");

        long time_add_first = TestFunctions.timeAddFirstArrayList(n, new ArrayList<>());

        System.out.print("ArrayList & " + time_add_first);

        long time_add_middle = TestFunctions.timeAddMiddleArrayList(n, new ArrayList<>());
        System.out.print(" & " + time_add_middle);

        long time_add_last = TestFunctions.timeAddLastArrayList(n, new ArrayList<>());
        System.out.println(" & " + time_add_last);

        for(int i=0; i<n; i++){
            Random r = new Random();
            ArrayListTest.r_list.add(r.nextInt());
        }
        System.out.println("\nREMOVING\n");


        long time_remove_first = TestFunctions.timeRemoveFirstArrayList((ArrayList<Integer>) r_list.clone());
        System.out.print("ArrayList & " + time_remove_first);

        long time_remove_middle = TestFunctions.timeRemoveMiddleArrayList((ArrayList<Integer>) r_list.clone());
        System.out.print(" & " + time_remove_middle);

        long time_remove_last = TestFunctions.timeRemoveLastArrayList(r_list);
        System.out.print(" & " + time_remove_last);

    }
}
