package leetcode.easy;

import java.util.Arrays;

public class NumberOfEvenAndOddBits2595 {
    public static int[] evenOddBit(int n) {
        String s = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        int[] ans = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i % 2 == 0) ans[0]++;
                else ans[1]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(17)));
    }
}
