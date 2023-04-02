package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;

public class NumberOfSubarraysWithLCMEqualToK2470 {
    public static int checkLCM(ArrayList<Integer> arr) {
        Collections.sort(arr);
        int lcm = arr.get(arr.size() - 1);
        for (Integer i : arr) {
            if (lcm % i != 0) lcm += arr.get(arr.size() - 1);
        }
        return lcm;
    }
    public static int subarrayLCM(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> sub = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                sub.add(nums[j]);
                if (checkLCM(sub) == k) {
                    c++;
                }
                else if (checkLCM(sub) > k) break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 4, 1};
        int k = 2;
        System.out.println(subarrayLCM(nums, k));
    }
}
