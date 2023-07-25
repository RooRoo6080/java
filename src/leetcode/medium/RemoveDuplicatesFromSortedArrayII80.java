package leetcode.medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII80 {
    public static int removeDuplicates(int[] nums) {
        int k = 0, start = 0, end = 2;
        while (end < nums.length) {
            if (nums[start] == nums[end]) {
                nums[end] = -10001;
                k++;
            } else start = end - 1;
            end++;
        }
        start = 0; end = 1;
        while (end < nums.length) {
            if (nums[start] == -10001) {
                if (nums[end] != -10001) {
                    nums[start] = nums[end];
                    nums[end] = -10001;
                    start++;
                }
            } else start++;
            end++;
        }
        return nums.length - k;
    }

    public static void main(String[] args) {
        int[] n = {0,0,0,0,0};
        System.out.println(removeDuplicates(n));
    }
}
