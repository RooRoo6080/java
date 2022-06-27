package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllLonelyNumbersInTheArray2150 {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> count = new ArrayList<>();
        int n = nums.length - 1;
        if (n == 0) {
            count.add(nums[n]);
            return count;
        }
        if (nums[0] + 1 < nums[1]) count.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] + 1 < nums[i] && nums[i] + 1 < nums[i + 1]) count.add(nums[i]);
        }
        if (nums[n - 1] + 1 < nums[n]) count.add(nums[n]);
        return count;
    }

    public static void main(String[] args) {
        FindAllLonelyNumbersInTheArray2150 falnita = new FindAllLonelyNumbersInTheArray2150();
        int[] arr = {1,3,5,3};
        System.out.println(falnita.findLonely(arr));
    }
}
