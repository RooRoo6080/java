package leetcode.medium;

import java.util.Arrays;

public class LongestArithmeticSubsquence1027 {
    public static int longestArithSeqLength(int[] nums) {
        int n = nums.length - 1;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], 1000);
            for (int j = i; j < n; j++) {
                dp[i][j] = nums[j + 1] - nums[i];
            }
        }
        for (int[] i : dp) System.out.println(Arrays.toString(i));
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                int t = 1;
                int val = linearSearch(dp[j + 1], dp[i][j]);
                System.out.println(val + " " + dp[i][j] + " " + j);
                while (val != -1) {
                    System.out.println(" --- | " + val + " " + dp[i][j]);
                    t++;
                    if (val + 1 < n) val = linearSearch(dp[val + 1], dp[i][j]);
                    else break;
                }
                c = Math.max(c, t);
            }
        }
        return c + 1;
    }

    private static int linearSearch(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) if (nums[i] == val) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {3,6,9,12};
        System.out.println(longestArithSeqLength(n));
    }
}
