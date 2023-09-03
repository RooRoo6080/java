package leetcode.medium;

import java.util.Arrays;

public class JumpGameII45 {
    public static int jump(int[] nums) {
        int[] total = new int[nums.length];
        Arrays.fill(total, 10001);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= Math.min(nums.length - 1, i + nums[i]); j++) {
                total[j] = Math.min(total[j], i);
                if (j == nums.length - 1) break;
            }
        }
        int i = nums.length - 1, c = 0;
        while (i != 0) {
            i = total[i];
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] num = {2,3,0,1,4};
        System.out.println(jump(num));
    }
}
