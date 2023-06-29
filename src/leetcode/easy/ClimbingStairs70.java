package leetcode.easy;

public class ClimbingStairs70 {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1;
        int b = 2;
        n -= 2;
        while (n-- > 0) {
            int t = a;
            a = b;
            b += t;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
