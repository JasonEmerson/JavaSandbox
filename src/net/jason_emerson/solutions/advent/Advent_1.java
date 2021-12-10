package net.jason_emerson.solutions.advent;


import java.util.List;

public class Advent_1 {

    public int countIncreasingScans(List<Integer> nums) {
        int count = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
