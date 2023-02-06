package leetcode.medium;

public class MinimumInsertionsToBalanceAParenthesesString1541 {
    public static int minInsertions(String s) {
        int ans = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (r % 2 > 0) {
                    r--;
                    ans++;
                }
                r += 2;
            } else {
                r--;
                if (r < 0) {
                    r += 2;
                    ans++;
                }
            }
        }
        return r + ans;
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
    }
}
