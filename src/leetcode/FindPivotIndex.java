package leetcode;
//724
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0, sum = 0;
        for (int i : nums) sum += i;
        for (int i = 0; i < nums.length; i++) {
            if (left == sum - left - nums[i]) return i;
            left += nums[i];
        }   
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex fpi = new FindPivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(fpi.pivotIndex(nums));
    }
}
