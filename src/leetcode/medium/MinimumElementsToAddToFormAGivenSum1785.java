package leetcode.medium;

public class MinimumElementsToAddToFormAGivenSum1785 {
    public static int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int i : nums) sum += i;
        return (int) Math.ceil((double) Math.abs(sum - goal) / limit);
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,1};
        System.out.println(minElements(nums, 3, -4));
    }
}
