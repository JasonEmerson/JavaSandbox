package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.LinkedListDaily;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedListDaily dailyList = new LinkedListDaily();
        createListAppend(dailyList, 10);
        printList(dailyList);
        dailyList.reverse();
        printList(dailyList);
    }

    public static void createListAppend(LinkedListDaily list, int  n) {
        for (int i = 0; i < n; i++) {
            list.append(i);
        }
    }

    public static void createListPrepend(LinkedListDaily list, int  n) {
        for (int i = 0; i < n; i++) {
            list.prepend(i);
        }
    }

    public static void printList(LinkedListDaily listDaily) {
        System.out.println();
        LinkedListDaily.Node current = listDaily.head;
        if (current == null)
            return;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
