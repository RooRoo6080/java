package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], sorted.length - i);
        }
        for (int i : score) {
            map.get(i);
            String add = switch (String.valueOf(map.get(i))) {
                case "1" -> "Gold Medal";
                case "2" -> "Silver Medal";
                case "3" -> "Bronze Medal";
                default -> String.valueOf(map.get(i));
            };
            ans.add(add);
        }
        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        RelativeRanks rr = new RelativeRanks();
        int[] score = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rr.findRelativeRanks(score)));
    }
}