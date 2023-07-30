package leetcode.medium;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements453 {
    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for (int i : nums) c += i - nums[0];
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves(nums));
    }
}
