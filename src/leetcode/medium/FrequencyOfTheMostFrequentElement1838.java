package leetcode.medium;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement1838 {
    /* v1 - TLE
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = nums.length - 1; i >= 1; i--) {
            int temp = k;
            int curr = 0;
            for (int j = i; j >= 0; j--) {
                temp -= nums[i] - nums[j];
                if (temp < 0) break;
                if (count < ++curr) count = curr;
            }
            if (curr == nums.length) break;
        }
        return count;
    }
     */

    public int maxFrequency(int[] nums, int k) {
        int mpf = 1, i, j = 0;
        long sum = 0;
        Arrays.sort(nums);
        for (i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum + k < (long) nums[i] * (i - j + 1)) {
                sum -= nums[j];
                j += 1;
            }
            mpf = Math.max(mpf, i - j + 1);
        }
        return mpf;
    }

    public static void main(String[] args) {
        FrequencyOfTheMostFrequentElement1838 fotmfe = new FrequencyOfTheMostFrequentElement1838();
        int[] arr = {3,9,6};
        int k = 2;
        System.out.println(fotmfe.maxFrequency(arr, k));
    }
}
