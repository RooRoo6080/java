package leetcode.medium;

public class CountNumbersWithUniqueDigits357 {
    public static int countNumbersWithUniqueDigits(int n) {
        int a = 9, b = 9, c = 1, ans = 1;
        for (int i = 0; i < n; i++) {
            c *= a;
            ans += c;
            a = b;
            b--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(3));
    }
}
