package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII229 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length <= 2) ans.add(nums[0]);
        Arrays.sort(nums);
        int n = nums.length / 3, c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) c++;
            else c = 1;
            if (c > n && !ans.contains(nums[i])) ans.add(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {3,2,3};
        System.out.println(majorityElement(n));
    }
}
