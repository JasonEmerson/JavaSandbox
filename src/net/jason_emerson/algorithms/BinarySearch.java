package net.jason_emerson.algorithms;

public class BinarySearch {

    public static boolean searchRecursive(int[] arr, int key, int start, int end) {
        if (start > end) return false;

        int mid = (start + end) / 2;

        if (key == arr[mid]) return true;

        if (key < arr[mid])
            return searchRecursive(arr, key, start, mid - 1);
        else
            return searchRecursive(arr, key, mid + 1, end);
    }

    public static boolean searchIterative(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (key == arr[mid]) return true;
            if (key < arr[mid]) end = mid - 1;
            if (key > arr[mid]) start = mid + 1;
        }
        return false;
    }
}

