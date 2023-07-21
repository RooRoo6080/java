package leetcode.medium;

public class MaximumSubarraySumWithOneDeletion1186 {
    public static int maximumSum(int[] arr) {
        if (arr.length == 1) return arr[0];
        int max = -100000;
        for (int i = 0; i < arr.length; i++) {
            int subtract = Math.max(arr[i], 0);
            int leftSum = subtract, maxLeft = -1000000;
            for (int j = i - 1; j >= 0; j--) {
                leftSum += arr[j];
                maxLeft = Math.max(maxLeft, leftSum);
            }
            int rightSum = subtract, maxRight = -1000000;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
                maxRight = Math.max(maxRight, rightSum);
            }
            max = Math.max(max, Math.max((Math.max(maxLeft, maxRight)), maxLeft + maxRight - subtract));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {-1,-1,-1,-1};
        System.out.println(maximumSum(array));
    }
}
