package leetcode.algorithm;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] original = nums.clone();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int index = i + k;
            while (index >= n) index -= n;
            nums[index] = original[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;
        rotate(nums, k);
    }
}
