package leetcode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int i = Integer.MIN_VALUE, j = 0;

        for (int k : nums) {
            j += k;
            if (i < j) i = j;
            if (j < 0) j = 0;
        }
        return i;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {5, 4, 7, 8, -1, 2};
        System.out.println(ms.maxSubArray(nums));
    }
}
