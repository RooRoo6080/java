package leetcode.medium;

public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        m--; n--;
        long ans = 1;
        int c = 1;
        for (int i = Math.max(m, n) + 1; i <= m + n; i++, c++) {
            ans *= i;
            ans /= c;
        }
        return (int) ans;
    }

    public static void main(String[] args) {

    }
}
