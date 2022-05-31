package leetcode.easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) n /= 4;
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfFour pof = new PowerOfFour();
        System.out.println(pof.isPowerOfFour(435));
    }
}
