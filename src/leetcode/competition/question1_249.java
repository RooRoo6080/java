package leetcode.competition;

import java.util.Arrays;

public class question1_249 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int j = 0; j < nums.length; j++) {
            ans[j] = nums[j];
            ans[j + nums.length] = nums[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        question1_249 q249 = new question1_249();
        int[] nums = {1, 2, 3, 1};
        System.out.println(Arrays.toString(q249.getConcatenation(nums)));
    }
}
