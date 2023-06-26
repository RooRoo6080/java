package leetcode.easy;

public class RichestCustomerWealth1672 {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int j : account) wealth += j;
            max = Math.max(wealth, max);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
