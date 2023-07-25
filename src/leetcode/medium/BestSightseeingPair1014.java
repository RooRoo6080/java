package leetcode.medium;

public class BestSightseeingPair1014 {
    public static int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int[] first = new int[n], last = new int[n];
        int max = -50001;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, values[i] + i);
            first[i] = max;
        }
        max = -50001;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, values[i] - i);
            last[i] = max;
        }
        max = -50001;
        for (int i = 0; i < n - 1; i++) max = Math.max(max, first[i] + last[i + 1]);
        return max;
    }

    public static void main(String[] args) {
        int[] v = {1,1,1};
        System.out.println(maxScoreSightseeingPair(v));
    }
}
