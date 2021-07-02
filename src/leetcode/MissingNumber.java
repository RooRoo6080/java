package leetcode;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();
        for (int i : nums) elements.add(i);

        for (int j = 0; j <= nums.length; j++) {
            if (!elements.contains(j)) return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {0};
        System.out.println(mn.missingNumber(nums));
    }
}
