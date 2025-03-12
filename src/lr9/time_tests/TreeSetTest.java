package src.lr9.time_tests;

import java.util.ResourceBundle;
import java.util.TreeSet;

public class TreeSetTest {
    static TreeSet<Integer> r_set = new TreeSet<>();


    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("src.lr9.time_tests/data");
        String collection_size =bundle.getString("collection_size");
        int n = Integer.parseInt(collection_size);

        System.out.println("ADDING\n");

        long time_add_first = TestFunctions.timeAddTreeSet(n, new TreeSet<>());

        System.out.print("TreeSet & " + time_add_first + " & - & -");


        for(int i=0; i<n; i++){
            TreeSetTest.r_set.add(i);
        }


        System.out.println("\nREMOVING\n from TreeSet with size " + r_set.size());

        long time_remove_first = TestFunctions.timeRemoveFirstTreeSet((TreeSet<Integer>) r_set.clone());

        System.out.print("TreeSet & " +  time_remove_first);

        long time_remove_last = TestFunctions.timeRemoveLastTreeSet((TreeSet<Integer>) r_set.clone());

        System.out.println(" & - & " + time_remove_last);
    }
}
