package leetcode;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1, current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                current++;
                if (current > max) max = current;
            } else current = 1;
        }
        return max;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence lcis = new LongestContinuousIncreasingSubsequence();
        int[] nums = {2, 2, 2, 2};
        System.out.println(lcis.findLengthOfLCIS(nums));
    }
}
