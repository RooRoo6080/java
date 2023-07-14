package leetcode.medium;

import java.util.Arrays;

public class NonOverlappingIntervals435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int[] arr = new int[Arrays.stream(intervals).flatMapToInt(Arrays::stream).summaryStatistics().getMax() + 1];
        int remove = 0;
        for (int[] i : intervals) {
            for (int j = i[0] + 1; j < i[1]; j++) {
                arr[j]++;
                if (arr[j] > 1) remove++;
            }
        }
        return remove / 2;
    }

    public static void main(String[] args) {
        int[][] inter = {{1,2},{1,2},{1,2},{1,2}};
        System.out.println(eraseOverlapIntervals(inter));
    }
}
