package src.lr9.task8;

public class Main {
    public static void main(String[] args) {
        OneLinkedList inst1, inst2, inst3, inst4;

        inst1 = new OneLinkedList();
        inst1.createHead();

        inst2 = new OneLinkedList();
        inst2.createTail();

        inst3 = new OneLinkedList();
        inst3.createHeadRec();

        inst4 = new OneLinkedList();
        inst4.createTailRec();

        System.out.println("Список созданный с Head:\n" + inst1);
        System.out.println("Список созданный с Tail:\n" + inst2);
        System.out.println("Список созданный с HeadRec:\n" + inst3);
        System.out.println("Список созданный с TailRec:\n" + inst4);

        OneLinkedList inst5 = new OneLinkedList();
        inst5.createHead(new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0});
        System.out.println("Список inst5 созданный с Head:\n" + inst5);

        System.out.println("Добавление первого элемента  inst5:");
        inst5.AddFirst(42);
        System.out.println(inst5);

        System.out.println("Добавление последнего элемента  inst5:");
        inst5.AddLast(42);
        System.out.println(inst5);

        System.out.println(" Удаление первого элемента  inst5:");
        inst5.RemoveFirst();
        System.out.println(inst5);

        System.out.println("Удаление последнего элемента  inst5:");
        inst5.RemoveLast();
        System.out.println(inst5);

        System.out.println("Вставка по индексу i = 6:");
        inst5.Insert(6, 42);
        System.out.println(inst5);

        System.out.println("Удаление по индексу i = 5:");
        inst5.Remove(5);
        System.out.println(inst5);

        System.out.println("toStringRec: " + inst5.toStringRec());
    }
}
