package net.jason_emerson.data_structures;

import net.jason_emerson.dailies.LinkedListDaily;

public class LinkedList {
    public Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        System.out.print("LIST: ");
        LinkedList.Node current = head;
        System.out.print(current.data + " ");
        while (current.next != null) {
            current = current.next;
            System.out.print(current.data + " ");
        }
        System.out.println();
    }

    public static class Node {
        public Node next;
        public int data;
        public Node(int data) {
            this.data = data;
        }
    }
}
