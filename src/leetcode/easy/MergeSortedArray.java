package leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m + n - 1;
        m--;
        n--;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) nums1[pos--] = nums1[m--];
            else nums1[pos--] = nums2[n--];
        }

        while (n >= 0) nums1[pos--] = nums2[n--];
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        msa.merge(nums1, m, nums2, n);
    }
}
