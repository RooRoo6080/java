package leetcode.easy;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> pairs = new HashMap<>(); //value, index
        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i]) && Math.abs(pairs.get(nums[i]) - i) <= k) {
                return true;
            }
            pairs.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 cd2 = new ContainsDuplicate2();
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(cd2.containsNearbyDuplicate(nums, k));
    }
}
