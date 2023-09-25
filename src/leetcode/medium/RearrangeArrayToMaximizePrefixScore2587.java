package leetcode.medium;

import java.util.Arrays;

public class RearrangeArrayToMaximizePrefixScore2587 {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        long curr = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            curr += nums[i];
            if (curr > 0) c++;
        }
        return c;
    }
}
