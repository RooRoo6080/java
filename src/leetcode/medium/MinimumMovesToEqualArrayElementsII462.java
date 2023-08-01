package leetcode.medium;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII462 {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int target = nums[nums.length / 2], count = 0;
        for (int i : nums) count += Math.abs(target - i);
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves2(nums));
    }
}
