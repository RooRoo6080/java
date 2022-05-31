package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1, 1};
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) ans[0] = i;
            }
            else ans[1] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        SetMismatch sm = new SetMismatch();
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(sm.findErrorNums(nums)));
    }
}
