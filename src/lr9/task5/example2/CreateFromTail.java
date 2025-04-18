package src.lr9.task5.example2;

public class CreateFromTail {

    public static void main(String[] args) {
    Node head = new Node(0, null);
    Node ref = head;
    for (int i = 1; i<9; i++){
        Node tail = new Node(i, null);
        ref.next = tail;
        ref = tail;
    }

    Node tmp = head;
    while (tmp != null){
        System.out.print(" " + tmp.value);
        tmp = tmp.next;}}}
