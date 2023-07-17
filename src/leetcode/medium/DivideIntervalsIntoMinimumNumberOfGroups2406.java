package leetcode.medium;

import java.util.Arrays;

public class DivideIntervalsIntoMinimumNumberOfGroups2406 {
//    public int minGroups(int[][] intervals) {
//        int[] arr = new int[Arrays.stream(intervals).flatMapToInt(Arrays::stream).summaryStatistics().getMax() + 1];
//        int max = 0;
//        for (int[] i : intervals) {
//            while (i[0] <= i[1]) {
//                arr[i[0]]++;
//                max = Math.max(max, arr[i[0]]);
//                i[0]++;
//            }
//        }
//        return max;
//    }
    public int minGroups(int[][] intervals) {
        int[] count = new int[1000002];
        int ans = 0, c = 0;
        for (int[] i : intervals) {
            count[i[0]]++;
            count[i[1] - 1]--;
        }
        for(int i : count){
            c += i;
            ans = Math.max(ans, c);
        }
        return ans;
    }
}
