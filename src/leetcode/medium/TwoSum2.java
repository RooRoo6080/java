package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = target - numbers[i];
            if (map.containsKey(sum) && map.get(sum) != i) return new int[] {map.get(sum) + 1, i + 1};
            else map.put(numbers[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum2 ts2 = new TwoSum2();
        int[] nums = {1, 2, 2, 3, 4};
        int target = 5;
        System.out.println(Arrays.toString(ts2.twoSum(nums, target)));
    }
}
