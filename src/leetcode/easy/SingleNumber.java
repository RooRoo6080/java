package leetcode.easy;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int setSum = 0;
        int numSum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
                setSum += i;
            }
            numSum += i;
        }
        return setSum * 2 - numSum;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {1, 0, 1};
        System.out.println(sn.singleNumber(nums));
    }
}
