package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.StackDaily;

public class TestStack {
    public static void main(String[] args) {
        StackDaily stack = new StackDaily(20);
        System.out.println(stack.isEmpty());
        stack.push(42);
        System.out.println(stack.peek());
        stack.push(7);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
