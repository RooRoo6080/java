package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestWellPerformingInterval1124 {
    public static int longestWPI(int[] hours) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i] > 8 ? 1 : -1;
            if (!map.containsKey(sum)) map.put(sum, i);
            if (sum > 0) count = i + 1;
            else if (map.containsKey(sum - 1)) count = Math.max(count, i - map.get(sum - 1));
        }
        return count;
    }

    public static void main(String[] args) {
        int[] hours = {6,6,6};
        System.out.println(longestWPI(hours));
    }
}
