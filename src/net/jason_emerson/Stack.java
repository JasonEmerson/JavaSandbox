package net.jason_emerson;

public class Stack {
    int[] array = new int[10];
    int top = 0;
    int size = 10;

    public void push(int data) {
        if (size == top) increaseSize();
        array[top++] = data;
    }

    public int pop() {
        int popped;
        if (array.length > 0) {
            popped = array[top - 1];
            top--;
        } else {
            return -1;
        }
        return popped;
    }

    public int peek() {
        if (array.length > 0) {
            return array[top - 1];
        }
        return -1;
    }

    public void increaseSize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < top; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = size * 2;
    }
}
