package leetcode.medium;

public class PartitionArrayIntoDisjointIntervals915 {
    public static int partitionDisjoint(int[] nums) {
        int[] arr = nums.clone();
        int c = 1000001;
        for (int i = arr.length - 1; i > 0; i--) {
            c = Math.min(c, arr[i]);
            arr[i] = c;
        }
        c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            c = Math.max(c, nums[i]);
            if (c <= arr[i + 1]) return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {1,1,1,0,6,12};
        System.out.println(partitionDisjoint(n));
    }
}
