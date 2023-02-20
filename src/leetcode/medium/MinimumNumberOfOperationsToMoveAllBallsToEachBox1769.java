package leetcode.medium;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox1769 {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        char[] b = boxes.toCharArray();
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (b[j] == '1') c += Math.abs(i - j);
            }
            res[i] = c;
        }
        return res;
    }

    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(Arrays.toString(minOperations(boxes)));
    }
}
