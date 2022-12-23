package leetcode.algorithm;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (right - left > 1) {
            int mid = (right + left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        if (nums[left] == target) return left;
        else if (nums[right] == target) return right;
        else return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 9, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }
}
