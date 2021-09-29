package net.jason_emerson.data_structures;

public class PriorityQ {
    private int maxSize;
    private int[] queArray;
    private int nItems;

    public PriorityQ(int size) {
        maxSize = size;
        queArray = new int[maxSize];
        nItems = 0;
    }

    public void insert(int data) {
        int top;

        if (nItems == 0)
            queArray[nItems++] = data;
        else {
            for (top = nItems - 1; top >= 0; top--) {
                if (data > queArray[top]) {
                    queArray[top + 1] = queArray[top];
                } else {
                    break;
                }
            }
            queArray[top + 1] = data;
            nItems++;
        }
    }

    public int remove() {
        return queArray[--nItems];
    }

    public int peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
