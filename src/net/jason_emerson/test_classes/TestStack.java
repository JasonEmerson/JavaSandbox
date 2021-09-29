package net.jason_emerson.test_classes;

import net.jason_emerson.data_structures.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(20);

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        printStack(stack);

        stack.pop();

        printStack(stack);

        stack.push(42);

        printStack(stack);

        System.out.println("Peek: " + stack.peek());
    }

    public static void printStack(Stack stack) {
        System.out.println("Stack size = " + stack.maxSize);
        System.out.println("Stack count = " + stack.top);
        for (int i = 0; i < stack.maxSize; i++) {
            System.out.print("[" + stack.stackArray[i] + "] ");
        }
        System.out.println();
        System.out.println();
    }
}
