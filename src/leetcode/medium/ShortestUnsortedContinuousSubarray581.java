package leetcode.medium;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int first = 0, last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != nums[i]) {
                first = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (arr[i] != nums[i]) {
                last = i;
                break;
            }
        }
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] n = {1};
        System.out.println(findUnsortedSubarray(n));
    }
}
