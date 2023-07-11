package leetcode.medium;

import java.util.Arrays;

public class FindTheMaximumNumberOfMarkedIndices2576 {
    public static int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, c = 0, left = 0, mid = (int) Math.ceil((double) n / 2 );
        while (mid < n) {
            if (nums[left] * 2 <= nums[mid]) {
                left++;
                c++;
            }
            mid++;
        }
        return c * 2;
    }

    public static void main(String[] args) {
        int[] nums = {9,2,5,4};
        System.out.println(maxNumOfMarkedIndices(nums));
    }
}

// 2 4 5 9