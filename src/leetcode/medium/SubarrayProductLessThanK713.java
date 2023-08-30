package leetcode.medium;

public class SubarrayProductLessThanK713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int c = 0, prod = 1;
        for (int left = 0, right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (left <= right && prod >= k) prod /= nums[left++];
            c += right - left + 1;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3};
        System.out.println(numSubarrayProductLessThanK(n, 0));
    }
}
