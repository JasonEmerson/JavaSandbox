package net.jason_emerson.data_structures;

public class Queue {
    private int maxSize;
    public int[] queArray;
    public int front;
    public int rear;
    public int count;

    public Queue(int size) {
        maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void add(int data) {
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
