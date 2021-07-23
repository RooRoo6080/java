package leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] < target) left = mid + 1;
            else if (nums[mid] == target) return mid;
            else right = mid - 1;
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(bs.search(nums, 9));
    }
}
