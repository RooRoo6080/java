package leetcode.easy;

import java.util.HashMap;

public class DegreeOfAnArray697 {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> n = new HashMap<>();
        HashMap<Integer, Integer> s = new HashMap<>();
        HashMap<Integer, Integer> e = new HashMap<>();
        int max = 1, d = 1;
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if (!n.containsKey(t)) {
                n.put(t, 1);
                s.put(t, i);
            }
            n.put(t, n.get(t) + 1);
            e.put(t, i);
            if (n.get(t) == max) {
                max = n.get(t);
                if (d > e.get(t) - s.get(t)) {
                    d = e.get(t) - s.get(t);
                }
            } else if (n.get(t) >= max) {
                max = n.get(t);
                d = e.get(t) - s.get(t);
            }
        }
        return d + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(numbers));
    }
}
