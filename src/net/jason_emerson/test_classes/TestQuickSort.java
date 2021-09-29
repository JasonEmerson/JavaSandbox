package net.jason_emerson.test_classes;

import net.jason_emerson.algorithms.QuickSort;
import net.jason_emerson.dailies.QuickSortDaily;

public class TestQuickSort {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 8, 5, 2, 1, 6, 4 };
//        int[] arr = createRandomArray(1000000, 1, 100);
//        int[] arr = getReverseArray(1000000000);

        System.out.println("Given Array");
        printArray(arr);
        QuickSort qSort = new QuickSort();


        long start = System.currentTimeMillis();
        qSort.sort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;


        System.out.println("\nSorted array");
        printArray(arr);

        System.out.println("Time: " + elapsedTime);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + ", ");
        System.out.println();
    }

    public static int[] getRandomArray(int size, int min, int max) {

        int[] tempArr = new int[size];
        for (int i = 0; i < size; i++) {
            int temp = (int) ((Math.random() * (max - min)) + min);
            tempArr[i] = temp;
        }
        return tempArr;
    }

    public static int[] getReverseArray(int size) {
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[(size - 1) - i] = i;
        }
        return temp;
    }
}
