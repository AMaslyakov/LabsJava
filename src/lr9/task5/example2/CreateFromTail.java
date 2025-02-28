package src.lr9.task5.example2;

public class CreateFromTail {

    public static void main(String[] args) {
    Node head = null;
    for (int i = 8; i>=0; i--){
        head = new Node(i, head);
    }

    Node ref = head;
    while (ref != null){
        System.out.print(" " + ref.value);
        ref = ref.next;
    }
    }
}
