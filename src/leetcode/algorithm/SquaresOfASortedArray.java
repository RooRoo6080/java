package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, c = right;
        int[] squared = new int[nums.length];
        while (left <= right) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                squared[c] = (int) Math.pow(nums[right], 2);
                right--;
            } else {
                squared[c] = (int) Math.pow(nums[left], 2);
                left++;
            }
            c--;
        }
        return squared;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
