package leetcode;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = nums.length;
        while (i < k) {
            if (nums[i] == val) {
                nums[i] = nums[k-1];
                k--;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {1, 2, 2, 3};
        int val = 2;
        System.out.println(re.removeElement(nums, val));
    }
}
