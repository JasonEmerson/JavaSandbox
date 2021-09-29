package net.jason_emerson.test_classes;

import net.jason_emerson.data_structures.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("List created");
        System.out.println("Append result (10 elements):");
        for(int i = 0; i < 10; i++) {
            list.append(i);
        }
        printList(list);

        System.out.println("Prepend result(add 42):");
        list.prepend(42);
        printList(list);

        System.out.println("deleteWithValue result(remove 42):");
        list.deleteWithValue(42);
        printList(list);

        System.out.println("deleteWithValue result(remove 4):");
        list.deleteWithValue(4);
        printList(list);

        System.out.println("deleteWithValue result(remove 99):");
        list.deleteWithValue(99);
        printList(list);
    }

    public static void printList(LinkedList list) {
        LinkedList.Node current = list.head;
        while (current.next != null) {
            System.out.print("[" + current.data + "]->");
            current = current.next;
        }
        System.out.print("[" + current.data + "] ");
        System.out.println();
        System.out.println();
    }
}
