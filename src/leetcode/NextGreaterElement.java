package leetcode;

import java.util.Arrays;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                }
            }
            if (ans[i] == 0) ans[i] = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        NextGreaterElement nge = new NextGreaterElement();
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nge.nextGreaterElement(nums1, nums2)));
    }
}
