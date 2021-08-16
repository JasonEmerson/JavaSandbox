package net.jason_emerson;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

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
        System.out.println("Stack size = " + stack.size);
        System.out.println("Stack count = " + stack.top);
        for (int i = 0; i < stack.size; i++) {
            System.out.print("[" + stack.array[i] + "] ");
        }
        System.out.println();
        System.out.println();
    }
}
