package src.lr9.time_tests;

import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class IndexTest {
   static ArrayList<Integer> r_list = new ArrayList<>();

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("src.lr9.time_tests/data");
        String collection_size =bundle.getString("size_for_index");
        int n = Integer.parseInt(collection_size);


       for(int i=0; i<n; i++){
            Random r = new Random();
            r_list.add(r.nextInt());
        }

       System.out.println("Size r_list: " + r_list.size());
       int n_queries = 1000000000;
       long start0 = System.currentTimeMillis();
       for(int i=0; i<n_queries; i++){
           r_list.get(0);
       }
       long end0 = System.currentTimeMillis();
       long totalTimeFor0 = end0 - start0;

       long start_h = System.currentTimeMillis();
       for(int i=0; i<n_queries; i++){
           r_list.get(n/2);
       }
       long end_h = System.currentTimeMillis();
       long totalTimeForH = end_h - start_h;

       long startL = System.currentTimeMillis();
       for(int i=0; i<n_queries; i++){
           r_list.get(n-1);
       }
       long endL = System.currentTimeMillis();
       long totalTimeForL = endL - startL;

       long avg_time_get = (totalTimeFor0 + totalTimeForH + totalTimeForL)/3;
        System.out.println("Среднее время получения элемента по индексу: " + avg_time_get);
    }
}
