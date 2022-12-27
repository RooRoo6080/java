package leetcode.algorithm;

import java.util.Arrays;

public class TwoSumII167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            ans[1] = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]) + 1;
            if (ans[1] >= 0) {
                ans[0] = i + 1;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
