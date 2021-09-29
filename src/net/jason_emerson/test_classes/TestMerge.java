package net.jason_emerson.test_classes;

import net.jason_emerson.algorithms.MergeSort;

public class TestMerge {
    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 2 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
