package leetcode.medium;

public class FindTheDuplicateNumber287 {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

    public static void main(String[] args) {
        int[] n = {3,1,3,4,2};
        System.out.println(findDuplicate(n));
    }
}
