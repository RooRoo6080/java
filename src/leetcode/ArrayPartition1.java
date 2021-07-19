package leetcode;

import java.util.Arrays;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) ans += nums[i];
        return ans;
    }

    public static void main(String[] args) {
        ArrayPartition1 ap1 = new ArrayPartition1();
        int[] nums = {1, 4, 3, 2};
        System.out.println(ap1.arrayPairSum(nums));
    }
}
