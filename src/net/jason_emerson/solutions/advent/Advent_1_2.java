package net.jason_emerson.solutions.advent;

import java.util.List;

public class Advent_1_2 {
    int prev;
    int current;
    int count;

    public int countScansSlidingWindow(List<Integer> ints) {
        prev = ints.get(0) + ints.get(1) + ints.get(2);
        System.out.println(prev + " ");
        for (int i = 3; i < ints.size(); i++) {
            current = ints.get(i - 2) + ints.get(i - 1) + ints.get(i);
            System.out.println(current + " ");
            if (current > prev) {
                count++;
            }
        }
        return count;
    }
}
