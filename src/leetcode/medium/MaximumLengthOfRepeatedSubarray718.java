package leetcode.medium;

import java.util.Arrays;

public class MaximumLengthOfRepeatedSubarray718 {
    public static int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, max = 0;
        if (m == 0 || n == 0) return 0;
        int[] dp = new int[n + 1];
        for (int i = m - 1; i >= 0; i--)
            for (int j = 0; j < n; j++)
                max = Math.max(max, dp[j] = nums1[i] == nums2[j] ? 1 + dp[j + 1] : 0);
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,1};
        int[] b = {3,2,1,4,7};
        System.out.println(findLength(a, b));
    }
}
