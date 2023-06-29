package leetcode.easy;

public class FibonacciNumber509 {
    public static int fib(int n) {
        if (n == 0) return 0;
        int a = 0;
        int b = 1;
        while (--n > 0) {
            int t = a;
            a = b;
            b += t;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
    }
}
