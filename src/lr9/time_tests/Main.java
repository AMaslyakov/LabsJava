package src.lr9.time_tests;


import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    static ArrayList<Integer> r_list = new ArrayList<>();
    static ArrayDeque<Integer> r_deque = new ArrayDeque<>();
    static TreeSet<Integer> r_set = new TreeSet<>();


    public static long timeAddTreeSet(int n, TreeSet<Integer> tree){
       long start =  System.currentTimeMillis();
        for(int i=0; i<n; i++){
            tree.add(i);
        }
        return System.currentTimeMillis() - start;

    }

    public static long timeAddFirstArrayDeque(int n, ArrayDeque<Integer> deque){
        long start =  System.currentTimeMillis();
        for(int i=0; i<n; i++){
            deque.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeAddFirstArrayList(int n, ArrayList<Integer> list){
        long start =  System.currentTimeMillis();
        for(int i=0; i<n; i++){
            list.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeAddLastArrayDeque(int n, ArrayDeque<Integer> deque){
       long start =  System.currentTimeMillis();
        for(int i=0; i<n; i++){
            deque.addLast(i);
        }
        return System.currentTimeMillis() - start;
    }

     public static long timeAddLastArrayList(int n, ArrayList<Integer> list){
       long start =  System.currentTimeMillis();
        for(int i=0; i<n; i++){
            list.addLast(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeAddMiddleArrayList(int n, ArrayList<Integer> list){
        long start =  System.currentTimeMillis();
        for(int i=0; i<n; i++){
            int half = list.size()/2;
            list.add(half, i);
        }
        return System.currentTimeMillis() - start;

    }

 public static long timeRemoveFirstArrayDeque(ArrayDeque<Integer> deque){
        long start =  System.currentTimeMillis();
        while(!deque.isEmpty()){
            deque.pollFirst();
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeRemoveFirstTreeSet(TreeSet<Integer> tree){
        long start =  System.currentTimeMillis();
        while(!tree.isEmpty()){
            tree.pollFirst();
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeRemoveFirstArrayList(ArrayList<Integer> list){
        long start =  System.currentTimeMillis();
        while (!list.isEmpty()){
            list.removeFirst();
        }
        return System.currentTimeMillis() - start;

    }

    public static long timeRemoveLastTreeSet(TreeSet<Integer> tree){
        long start =  System.currentTimeMillis();
        while(!tree.isEmpty()){
            tree.pollLast();
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeRemoveLastArrayDeque(ArrayDeque<Integer> deque){
        long start =  System.currentTimeMillis();
        while(!deque.isEmpty()){
            deque.pollLast();
        }
        return System.currentTimeMillis() - start;
    }

    public static long timeRemoveLastArrayList(ArrayList<Integer> list){
        long start =  System.currentTimeMillis();
        while (!list.isEmpty()){
            list.removeLast();
        }
        return System.currentTimeMillis() - start;

    }

    public static long timeRemoveMiddleArrayList(ArrayList<Integer> list){
       long start =  System.currentTimeMillis();
        while (!list.isEmpty()){
            list.remove(list.size()/2);
        }
        return System.currentTimeMillis() - start;
    }


    public static void main(String[] args) {

        int n = 15000000;

        for(int i=0; i<n; i++){
            Random r = new Random();
            r_deque.add(r.nextInt());
            r_list.add(r.nextInt());
            r_set.add(i);
        }


        //1 Сравнение времени выполнения операции добавление элемента в начало коллекции;
        // ArrayDeque addFirst(e)
        //TreeSet -
        //ArrayList  add(0, e)

        ArrayDeque<Integer> array_deque = new ArrayDeque<>();
        long  time_add_first_array_deque = timeAddFirstArrayDeque(n, array_deque);
        ArrayList<Integer> array_list = new ArrayList<>();
        long  time_add_first_array_list = timeAddFirstArrayList(n, array_list);
        TreeSet<Integer> tree_set = new TreeSet<>();
        long time_add_tree_set = timeAddTreeSet(n, tree_set);

        String format = " ArrayList add First: %d\n" +
                        "ArrayDeque add First: %d\n" +
                        "TreeSet Add: %d\n";
//        System.out.printf(format, time_add_first_array_list, time_add_first_array_deque, time_add_tree_set);


        //2 Сравнение времени выполнения операции добавление элемента в конец
        //коллекции;
        // ArrayDeque addLast(e)
        //TreeSet -
        //ArrayList  add(e)

        array_deque.clear();
        array_list.clear();

        long time_add_last_arraydeque = timeAddLastArrayDeque(n, array_deque);
        long time_add_last_arraylist = timeAddLastArrayList(n, array_list);


        format = " ArrayList add last: %d\n" +
                " ArrayDeque add last: %d\n" +
                "TreeSet add: %d\n";
//        System.out.printf(format, time_add_last_arraylist, time_add_last_arraydeque, time_add_tree_set);

        //3 Сравнение времени выполнения операции добавление элемента в
        //середину коллекции;
        // ArrayDeque -
        //TreeSet -
        //ArrayList add(i, e)
        array_list.clear();

        long time_add_middle_array_list = timeAddMiddleArrayList(n, array_list);
       format = " ArrayList add middle: %d\n" +
                " ArrayDeque add middle: -\n" +
                "TreeSet add middle: -\n";
//        System.out.printf(format, time_add_middle_array_list);

        //4 Сравнение времени выполнения операции удаления элемента в начале
        //коллекции;
        // ArrayDeque - pollFirst()
        //TreeSet - pollFirst()
        //ArrayList remove(0)

        long time_remove_first_arraydeque = timeRemoveFirstArrayDeque(array_deque);
        long time_remove_first_tree_set = timeRemoveFirstTreeSet(tree_set);
        long time_remove_first_arraylist = timeRemoveFirstArrayList(array_list);
        format = " ArrayList remove first: %d\n" +
                " ArrayDeque remove first: %d\n" +
                "TreeSet add remove first: %d\n";
//        System.out.printf(format, time_remove_first_arraylist, time_remove_first_arraydeque, time_remove_first_tree_set);


        //5 Сравнение времени выполнения операции удаления элемента в конце
        //коллекции;
        // ArrayDeque - pollLast()
        //TreeSet - pollLast()
        //ArrayList removeLast()
        long time_remove_last_arraydeque = timeRemoveLastArrayDeque(r_deque.clone());
        long time_remove_last_tree_set = timeRemoveLastTreeSet((TreeSet<Integer>) r_set.clone());
        long time_remove_last_array_list = timeRemoveLastArrayList((ArrayList<Integer>) r_list.clone());

        format = " ArrayList remove last: %d\n" +
                " ArrayDeque remove last: %d\n" +
                "TreeSet add remove last: %d\n";

//        System.out.printf(format, time_remove_last_array_list, time_remove_last_arraydeque, time_remove_last_tree_set);

        //6 Сравнение времени выполнения операции удаления элемента в
        //середине коллекции;
        // ArrayDeque -
        //TreeSet -
        //ArrayList - remove(i)

        long time_remove_middle_array_list = timeRemoveMiddleArrayList(r_list);

       // Таблица 1 Сравнение времени выполнения операции добавления

        String pattern = "%12s & %12d & %12d & %12d\\\\\n";

        System.out.println(" Коллекция & Начало &  Середина & Конец\\\\");
        System.out.printf(pattern, "ArrayDeque",
                time_add_first_array_deque,
                0,
                time_add_last_arraydeque);
       System.out.printf(pattern, "TreeSet",
                time_add_tree_set,
                0,
                0);
       System.out.printf(pattern, "ArrayList",
                time_add_first_array_list,
                time_add_middle_array_list,
                time_add_last_arraylist);

       System.out.println();
       System.out.println();
       //2. Сравнение времени выполнения операции удаления
       System.out.println(" Коллекция & Начало &  Середина & Конец\\\\");
       System.out.printf(pattern, "ArrayDeque",
                time_remove_first_arraydeque,
                0,
                time_remove_last_arraydeque);
       System.out.printf(pattern, "TreeSet",
                time_remove_first_tree_set,
                0,
                time_remove_last_tree_set);
       System.out.printf(pattern, "ArrayList",
                time_remove_first_arraylist,
                time_remove_middle_array_list,
                time_remove_last_array_list);






        //7 Сравнение времени выполнения операции получения элемента по
        //индексу;

        // ArrayDeque -
        //TreeSet -
        //ArrayList - add(i)
    }
}

