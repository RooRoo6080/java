package leetcode;

public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Double.NEGATIVE_INFINITY;
        double max = 0;


        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            if (i >= k - 1) {
                ans = Math.max(ans, max / k);
                max -= nums[i - k + 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumAverageSubarray1 mas1 = new MaximumAverageSubarray1();
        int[] nums = {5};
        int k = 1;
        System.out.println(mas1.findMaxAverage(nums, k));
    }
}
