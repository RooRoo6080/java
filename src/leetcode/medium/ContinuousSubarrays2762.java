package leetcode.medium;

import java.util.TreeMap;

public class ContinuousSubarrays2762 {
//    public static long continuousSubarrays(int[] nums) {
//        long c = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int min = nums[i], max = nums[i];
//            for (int j = i; j >= 0; j--) {
//                min = Math.min(min, nums[j]);
//                max = Math.max(max, nums[j]);
//                if (max - min > 2) break;
//                c++;
//            }
//        }
//        return c;
//    }
    public static long continuousSubarrays(int[] nums) {
        long c = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1); //how many times it appears
            while (map.size() > 1 && map.lastKey() - map.firstKey() > 2) {
                map.put(nums[left], map.get(nums[left]) - 1); // "used" value
                if (map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            c += right - left + 1; //add # of subarrays
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,2,4};
        System.out.println(continuousSubarrays(nums));
    }
}
