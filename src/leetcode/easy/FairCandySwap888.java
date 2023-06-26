package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap888 {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;
        for (int i : aliceSizes) a += i;
        Set<Integer> s = new HashSet<>();
        for (int i : bobSizes) {
            b += i;
            s.add(i);
        }
        int diff = (b - a) / 2;
        for (int i : aliceSizes) {
            if (s.contains(i + diff)) return new int[]{i, i + diff};
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
