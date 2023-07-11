package leetcode.medium;

public class LongestBinarySubsequenceLessThanOrEqualToK2311 {
//    public static int longestSubsequence(String s, int k) {
//        int start = 0, c = 0;
//        for (int end = 1; end <= s.length(); end++) {
//            String a = s.substring(start, end);
//            if (Integer.parseInt(a, 2) <= k) c = Math.max(c, a.length());
//            else start++;
//        }
//        return c;
//    }

    public static int longestSubsequence(String s, int k) {
        int start = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Long.parseLong(s.substring(i), 2) > k) break;
            start = i;
        }
        int c = s.length() - start;
        for (int i = 0; i < start; i++) {
            if (s.charAt(i) == '0') c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "00101001";
        int k = 1;
        System.out.println(longestSubsequence(s, k));
    }
}
