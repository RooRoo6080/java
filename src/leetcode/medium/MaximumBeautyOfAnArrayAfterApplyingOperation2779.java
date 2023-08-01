package leetcode.medium;

import java.util.Arrays;

public class MaximumBeautyOfAnArrayAfterApplyingOperation2779 {
//    public static int maximumBeauty(int[] nums, int k) {
//        HashMap<Integer, Integer> count = new HashMap<>();
//        for (int i : nums) {
//            for (int j = i - k; j <= i + k; j++) {
//                count.put(j, count.getOrDefault(j, 0) + 1);
//            }
//        }
//        return Collections.max(count.values());
//    }

    public static int maximumBeauty(int[] nums, int k) {
        int[] arr = new int[Arrays.stream(nums).max().getAsInt() + 2 * k + 2];
        for (int i : nums) {
            arr[i]++;
            arr[i + 2 * k + 1]--;
        }
        int max = 0, c = 0;
        for (int i : arr) {
            c += i;
            max = Math.max(max, c);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {13,46,71};
        int k = 29;
        System.out.println(maximumBeauty(nums, k));
    }
}
