package leetcode.easy;

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n > 0) {
            for (int i=2; i<6; i++) {
                while (n % i == 0) n /= i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber un = new UglyNumber();
        System.out.println(un.isUgly(8));
    }
}
