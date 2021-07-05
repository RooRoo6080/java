package leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int current = nums[count];
                nums[count] = nums[i];
                nums[i] = current;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {1, 0, 3, 0, 12};
        mz.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
