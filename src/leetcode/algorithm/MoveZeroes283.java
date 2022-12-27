package leetcode.algorithm;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void moveZeroes(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            nums[c++] = nums[i];
        }
        while (c < nums.length) nums[c++] = 0;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
    }
}
