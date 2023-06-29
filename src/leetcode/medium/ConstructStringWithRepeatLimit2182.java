package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ConstructStringWithRepeatLimit2182 {
    public static String repeatLimitedString(String s, int repeatLimit) {
        int[] chars = new int[26];
        LinkedHashSet<Integer> indexes = new LinkedHashSet<>();
        for (char i : s.toCharArray()) {
            chars[i - 'a']++;
            indexes.add(i - 'a');
        }
        ArrayList<Integer> indexesSorted = new ArrayList<>(indexes);
        StringBuilder out = new StringBuilder();
        indexesSorted.sort(Collections.reverseOrder());
        out.append((char) ('a' + indexesSorted.get(0)));
        int streak = 1, prev = indexesSorted.get(0);
        for (int i = 1; i < indexesSorted.size(); i++) {
            if (chars[indexesSorted.get(i)] == 0) continue;
            if (indexesSorted.get(i) != prev) {
                prev = indexesSorted.get(i);
                streak = 0;
            }
            if (streak <= repeatLimit) {
                out.append((char) ('a' + indexesSorted.get(i)));
                chars[indexesSorted.get(i)]--;
                streak++;
            }
            if (i > 0 || chars[indexesSorted.get(i - 1)] > 0) {
                out.append((char) ('a' + indexesSorted.get(i - 1)));
                prev = indexesSorted.get(i - 1);
                streak = 1;
            }
            i--;
        }
        return out.toString();
    }

    public static void main(String[] args) {
        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimitedString(s, repeatLimit));
    }
}
