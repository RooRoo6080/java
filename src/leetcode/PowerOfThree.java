package leetcode;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfThree pot = new PowerOfThree();
        System.out.println(pot.isPowerOfThree(2));
    }
}
