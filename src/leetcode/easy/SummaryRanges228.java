package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            while (i < nums.length - 1 && nums[i + 1] - 1 == nums[i]) {
                i++;
            }
            if (curr == nums[i]) { ranges.add(String.valueOf(curr)); } else { ranges.add(curr + "->" + nums[i]); }
        }
        return ranges;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));

    }
}
