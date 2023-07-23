package leetcode.medium;

import java.util.Arrays;

public class RemoveCoveredIntervals1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i, j) -> (i[0] == j[0] ? j[1] - i[1] : i[0] - j[0]));
        int ans = 0, c = 0;
        for (int[] i : intervals) {
            if (c < i[1]) {
                c = i[1];
                ans++;
            }
        }
        return ans;
    }
}
