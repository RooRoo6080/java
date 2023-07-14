package leetcode.medium;

public class GetEqualSubstringsWithinBudget {
    public static int equalSubstring(String s, String t, int maxCost) {
        int[] costs = new int[s.length()];
        for (int i = 0; i < s.length(); i++) costs[i] = Math.abs(s.charAt(i) - t.charAt(i));
        int max = 0, left = 0, right = 0, cost = 0;
        while (right < s.length()) {
            cost += costs[right];
            if (cost <= maxCost) max = Math.max(max, right - left + 1);
            else cost -= costs[left++];
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(equalSubstring("abcd", "acde", 0));
    }
}
