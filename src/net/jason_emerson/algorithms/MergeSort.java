package net.jason_emerson.algorithms;

public class MergeSort {

    public void sort(int[] arr, int start, int end) {
        if(start == end) return;

        int mid = (start + end) / 2;

        sort(arr, start, mid);
        sort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public void merge(int[] Arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end) {
            if(Arr[i] <= Arr[j])
                temp[k++] = Arr[i++];
            else
                temp[k++] = Arr[j++];
        }

        while(i <= mid) {
            temp[k++] = Arr[i++];
        }

        while(j <= end) {
            temp[k++] = Arr[j++];
        }

        for(i = start; i <= end; i++) {
            Arr[i] = temp[i - start];
        }
    }
}
