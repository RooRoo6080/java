package leetcode;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int prev = cost[0];
        int cur = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int tmp = cost[i] + Math.min(prev, cur);
            prev = cur;
            cur = tmp;
        }
        return Math.min(prev, cur);
    }

    public static void main(String[] args) {
        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
        int[] cost = {10, 15, 20};
        System.out.println(mccs.minCostClimbingStairs(cost));
    }
}
