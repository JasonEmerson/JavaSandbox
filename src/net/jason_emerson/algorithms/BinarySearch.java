package net.jason_emerson.algorithms;

public class BinarySearch {
    public boolean searchIter(int[] nums, int key) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (key == nums[mid]) return true;
            if (key < nums[mid]) hi = mid - 1;
            if (key > nums[mid]) lo = mid + 1;
        }
        return false;
    }

    public boolean searchRecursive(int[] nums, int key, int start, int end) {
        if (start >= end) return false;
        int mid = (start + end) / 2;

        if (key == nums[mid]) return true;

        if (key < nums[mid])
            return searchRecursive(nums, key, start, mid - 1);
        else
            return searchRecursive(nums, key, mid + 1, end);
    }
}
