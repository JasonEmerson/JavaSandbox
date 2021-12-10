package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.MergeSortDaily;
import net.jason_emerson.dailies.QuickSortDaily;

public class TestMergeSort {
    public static void main(String[] args) {
        QuickSortDaily sort = new QuickSortDaily();
        int[] arr = new int[]{9, 4, 2, 36, 2, 4, 1, 3, 6, 7, 3, 8, 5, 6, 4};
        sort.sort(arr, 0, arr.length - 1);
        printList(arr);
    }

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
