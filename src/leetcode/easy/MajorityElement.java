package leetcode.easy;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
                if (count.get(i) > len / 2) return i;
            } else {
                count.put(i, 1);
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(me.majorityElement(nums));
    }
}
