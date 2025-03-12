package src.lr9.time_tests;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class TestFunctions {
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
}
