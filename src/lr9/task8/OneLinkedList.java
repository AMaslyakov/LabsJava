package src.lr9.task8;

import java.util.Scanner;

public class OneLinkedList {

    private Node head;
    private Node tail;

    public void createHead(){
        tail = null;
        head = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
                head = new Node(input.nextInt(), head);
            }

    }

    public void createHead(int[] arg){
        tail = null;
        head = null;
        for (int value: arg) {
            head = new Node(value, head);
        }
    }

    public void createTail(){
        head = null;
        tail = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int N = input.nextInt();
        head = new Node(input.nextInt(), null);
        Node ref = head;
        for (int i = 1; i<N; i++){
            tail = new Node(input.nextInt(), null);
            ref.next = tail;
            ref = tail;
        }
    }

    public void createHeadRec(){
        head = null;
        tail = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int N = input.nextInt();
        createHeadRec(N, input);
    }

    private void createHeadRec(int N, Scanner input){
        if (N == 1){
            head = new Node(input.nextInt(), head);
        } else {
            head = new Node(input.nextInt(), head);
            createHeadRec(N - 1, input);
        }

    }

    public void createTailRec(){
        head = null;
        tail = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов списка:");
        int N = input.nextInt();
        head = new Node(input.nextInt(), null);
        createTailRec(N, input, head);
    }

    private void createTailRec(int N, Scanner input, Node tmp) {
       if(N == 1){
           tail = new Node(input.nextInt(), null);
           tmp.next =tail;
       } else {
           tail = new Node(input.nextInt(), null);
           tmp.next = tail;
           tmp = tail;
           createTailRec(N-1, input, tmp);
       }
    }

    public String toString(){
        Node ref = this.head;
        StringBuilder result = new StringBuilder();
        result.append("[");
        while (ref != null) {
            result.append(ref.value);
            if(ref.next != null) result.append(", ");
            ref = ref.next;
        }
        result.append("]");
        return result.toString();
    }

    public String toStringRec(){
        StringBuilder result = new StringBuilder();
        result.append("[");
        return toStringRec(head, result);
    }

    private String toStringRec(Node tmp, StringBuilder result){
        if(tmp == null){
            result.append("]");
            return result.toString();
        } else {
            result.append(tmp.value);
            if (tmp.next != null) result.append(", ");
            return toStringRec(tmp.next, result);
        }
    }

    public void AddFirst(int value){
        head = new Node(value, head);
    }

    public void AddLast(int value){
        Node tmp;
        if(tail != null){
            tmp = new Node(value, null);
            tail.next =tmp;
        } else {
            tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(value, null);

        }
    }

    public void Insert(int index, int value){

        if(index ==0){
            head = new Node(value, head);
            return;
        }

        Node tmp = head;
        Node new_node = new Node(value, null);
        for(int i=0; i<index-1; i++){
            if (tmp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            tmp = tmp.next;
        }
        if (tmp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index<0){
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        }
        Node tmp_next = tmp.next;
        tmp.next = new_node;
        new_node.next = tmp_next;
    }

    public void RemoveFirst(){
        head = head.next;
    }

    public void RemoveLast(){
        Node tmp, pre;
        pre = head;
        tmp = head.next;
        while (tmp.next != null){
            pre = pre.next;
            tmp = tmp.next;
        }
        pre.next = null;
    }

    public void Remove(int index){
        if(index ==0){
            head = head.next;
            return;
        }

        Node tmp = head;
        for(int i=0; i<index-1; i++){
            if (tmp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            tmp = tmp.next;
        }
        if (tmp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index<0){
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        }
        tmp.next = tmp.next.next;

    }

}
