package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.ArrayListDaily;


public class TestDynamicArray {
    public static void main(String[] args) {
        ArrayListDaily arrayList = new ArrayListDaily();

        System.out.println("Adding data to list: ");
        arrayList.add(10);
        printArray(arrayList.list);
        arrayList.add(20);
        printArray(arrayList.list);
        arrayList.add(30);
        printArray(arrayList.list);
        arrayList.add(40);
        printArray(arrayList.list);
        arrayList.add(50);
        printArray(arrayList.list);

        System.out.println("\nDeleting at index 0, 1, 2: ");
        printArray(arrayList.list);
        System.out.println();
        arrayList.deleteAt(0);
        printArray(arrayList.list);
        arrayList.deleteAt(1);
        printArray(arrayList.list);
        arrayList.deleteAt(2);
        printArray(arrayList.list);

        System.out.println("\nAdding 42 to index 0: ");
        printArray(arrayList.list);
        arrayList.addAt(0, 42);
        printArray(arrayList.list);

        System.out.println("\ndeleting: ");
        System.out.println("count = " + arrayList.count);
        printArray(arrayList.list);
        arrayList.delete();
        printArray(arrayList.list);
        arrayList.delete();
        printArray(arrayList.list);
        arrayList.delete();
        printArray(arrayList.list);
    }
    
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
