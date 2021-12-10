package net.jason_emerson.data_structures;

public class CharStack {
    public char[] stackArray;
    public int top;
    public int maxSize;

    public CharStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char data) {
        stackArray[++top] = data;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
