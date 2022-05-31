package leetcode.easy;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> repeated = new HashSet<>();
        while (!repeated.contains(n)) {
            repeated.add(n);
            n = addSquare(n);
            if (n == 1) return true;
        }
        return false;
    }

    public static int addSquare(int n) {
        int total = 0;
        while (n > 0) {
            total += (n % 10) * (n % 10);
            n /= 10;
        }
        return total;
    }

    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));
    }
}
