package leetcode.medium;

import java.util.Arrays;

public class RemoveStonesToMinimizeTheTotal1962 {
    public static int minStoneSum(int[] piles, int k) {
        int n = piles.length - 1;
        for (int i = 0; i < k; i++) {
            Arrays.sort(piles);
            piles[n] -= piles[n] / 2;
        }
        int c = 0;
        for (int i : piles) c += i;
        return c;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] piles = {4,3,6,7};
        System.out.println(minStoneSum(piles, k));
    }
}
