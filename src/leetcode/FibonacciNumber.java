package leetcode;

public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        int x = 0;
        int y = 1;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = y;
            y += x;
            x = temp;
        }
        return y;
    }

    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println(fn.fib(0));
    }
}