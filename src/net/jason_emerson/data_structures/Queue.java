package net.jason_emerson.data_structures;

public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int count;

    public Queue(int size) {
        maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void insert(int data) {
        if(rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = data;
        count++;
    }

    public int remove() {
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        count--;
        return temp;
    }

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == maxSize);
    }

    public int size() {
        return count;
    }
}
