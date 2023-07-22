package leetcode.medium;

import java.util.*;

public class SortIntegersByPowerValue1387 {
    public static int getKth(int lo, int hi, int k) {
        int[][] powerValues = new int[hi - lo + 1][2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lo; i <= hi; i++) powerValues[i - lo] = new int[]{i, power(map, i)};
        Arrays.sort(powerValues, (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        return powerValues[k - 1][0];
    }

    private static int power(Map<Integer, Integer> map, int x) {
        if (x == 1) return 0;
        if (map.containsKey(x)) return map.get(x);
        int i;
        if (x % 2 == 0) i = power(map, x / 2) + 1;
        else i = power(map, x * 3 + 1) + 1;
        map.put(x, i);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(getKth(12, 15, 2));
    }
}
