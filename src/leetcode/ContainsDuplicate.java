package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicated = new HashSet<>();
        for (int i : nums) {
            if (duplicated.contains(i)) {
                return true;
            }
            duplicated.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 2};
        System.out.println(cd.containsDuplicate(nums));
    }
}
