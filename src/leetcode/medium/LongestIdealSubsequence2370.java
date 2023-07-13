package leetcode.medium;

public class LongestIdealSubsequence2370 {
    public static int longestIdealString(String s, int k) {
        int[] chars = new int[26];
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            chars[a]++;
            for (int j = Math.max(0, a - k); j <= Math.min(25, a + k); j++) {
                if (j != a) {
                    chars[a] = Math.max(chars[a], chars[j] + 1);
                }
            }
            ans = Math.max(ans, chars[a]);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "acfgbd";
        int k = 2;
        System.out.println(longestIdealString(s, k));
    }
}
