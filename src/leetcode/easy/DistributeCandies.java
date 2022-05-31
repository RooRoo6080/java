package leetcode.easy;

import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : candyType) set.add(i);
        return Math.min(candyType.length / 2, set.toArray().length);
    }

    public static void main(String[] args) {
        DistributeCandies dc = new DistributeCandies();
        int[] candyType = {1, 1, 2, 2, 3, 3};
        System.out.println(dc.distributeCandies(candyType));
    }
}
