package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.BinarySearchDaily;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 6, 8, 10};
        BinarySearchDaily searchDaily = new BinarySearchDaily();

        System.out.println(searchDaily.searchRecursive(nums, 6, 0, nums.length));
    }
}
