package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sum3 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int l = j + 1; l < nums.length; l++) {
                     if (nums[i] + nums[j] + nums[l] == 0) {
                         sum3.add(Arrays.asList(nums[i], nums[j], nums[l]));
                     }
                }
            }
        }
        return sum3;
    }

    public static void main(String[] args) {
        int[] numbers = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));
    }
}
