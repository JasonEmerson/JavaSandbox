package net.jason_emerson;

public class TestTriangles {
    public static void main(String[] args) {
        //triangleMathRec(1, 0);
        System.out.println(triangle(1));
    }

//    o
//    o o           o
//    o o o         o o        o
//    o o o o -->   o o o -->  o o -->  o (nth term = sum of n column + n - 1 column until n == 1)
//    nth triangular number = (n2+n)/2

//    tri(n) = 1 if n = 1
//    tri(n) = n + tri(n–1) if n > 1

    public static int triangle(int n) { //rec routine with only one parameter
        if(n == 1)
            return 1;
        else
            return(n + triangle(n - 1));
    }

    static int triangleRec(int n, int total) {  //rec routine with total parameter
        if(n < 1) return total;
        return triangleRec(n - 1, n + total);
    }

    static int triangleWhile(int n) {
        int total = 0;
        while(n > 0) {           // until n is 1
            total = total + n;   // add n (column height) to total
            --n;                 // decrement column height
        }
        return total;
    }

    public static void triangleMathLoop(int num) {
        int current = 1;
        for (int i = 2; i < num; i++) {
            System.out.print(current += i);
            System.out.print(" ");
        }
    }

    public static int triangleMathRec(int i, int current) {
        if(i > 10) return -1;
        current += i;
        System.out.println(current);
        return triangleMathRec(i + 1, current);
    }
}
