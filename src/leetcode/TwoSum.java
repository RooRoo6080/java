package leetcode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

            for (int i =0; i < nums.length-1; i++) {
                for (int j =i+1; j < nums.length; j++) {

                    if(nums[i] + nums[j] == target){
                        return new int [] {i, j};
                    }
                }

            }
            return new int[] {};
    }

    public static void main (String[] args) {
        int[] array = {1, 2, 3, 5};
        int t = 5;
        TwoSum obj = new TwoSum();
        double startTime = System.nanoTime();
        System.out.println(Arrays.toString(obj.twoSum(array, t)));
        System.out.println((System.nanoTime() - startTime) / 1000000);
    }
}
