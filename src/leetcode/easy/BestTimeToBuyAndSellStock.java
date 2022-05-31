package leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int profit = 0;
        for (int i : prices) {
            if (i < smallest) {
                smallest = i;
            } else if (i - smallest > profit) {
                profit = i - smallest;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bttbass = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(bttbass.maxProfit(prices));
    }
}
