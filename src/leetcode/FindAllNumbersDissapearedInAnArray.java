package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDissapearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] appearances = new int[nums.length + 1];
        for (int i : nums) appearances[i]++;
        for(int i = 1; i < appearances.length; i++) if(appearances[i] == 0) ans.add(i);
        return ans;
    }

    public static void main(String[] args) {
        FindAllNumbersDissapearedInAnArray fandiaa = new FindAllNumbersDissapearedInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(fandiaa.findDisappearedNumbers(nums));
    }
}