package net.jason_emerson.algorithms;

public class QuickSort {

    public void sort(int[] arr, int start, int end) {
        if (start == end) return;

        int index = partition(arr, start, end);

        sort(arr, start, index - 1);
        sort(arr, index, end);
    }

    private int partition(int[] arr, int s, int e) {
        int start = s;
        int end = e;
        int pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;

            if (start <= end) {
                swapArray(arr, start, end);
                start++;
                end--;
            }
        }
        System.out.println("\nIndex Check: " + start);
        return start;
    }

    private void swapArray(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
