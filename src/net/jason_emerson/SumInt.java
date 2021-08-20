package net.jason_emerson;

// write a recursive function that given an input n
// sums all non-negative integers up to n.

public class SumInt {
    public static void main(String[] args) {
        System.out.println(sumInt(10));
    }

    public static int sumInt(int n) {
        if (n == 0)
            return 0;
        return sumInt(n - 1) + n;
    }
}
