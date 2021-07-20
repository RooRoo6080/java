package leetcode;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) res = Math.max(res, map.get(i) + map.get(i + 1));
        }
        return res;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence lhs = new LongestHarmoniousSubsequence();
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(lhs.findLHS(nums));
    }
}
