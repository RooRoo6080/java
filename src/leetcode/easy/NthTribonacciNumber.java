package leetcode.easy;

public class NthTribonacciNumber {
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        int a = 0, b = 1, c = 1;
        n--;
        while (--n > 0) {
            int t1 = a;
            int t2 = b;
            a = b;
            b = c;
            c += t1 + t2;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(2));
    }
}
