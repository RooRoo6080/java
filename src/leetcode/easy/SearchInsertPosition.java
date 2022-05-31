package leetcode.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || target < nums[i]) {
                return i;
            }
            if (i < nums.length-1 && target < nums[i+1]) {
                return i + 1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(sip.searchInsert(nums, target));
    }
}
