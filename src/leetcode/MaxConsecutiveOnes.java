package leetcode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, ans = 0;
        for (int i : nums) {
            if ((i & 1) == 1) count ++;
            else count = 0;
            if (count > ans) ans = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println(mco.findMaxConsecutiveOnes(nums));
    }
}
