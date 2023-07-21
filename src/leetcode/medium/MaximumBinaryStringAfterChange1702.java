package leetcode.medium;

import java.util.Arrays;

public class MaximumBinaryStringAfterChange1702 {
    public static String maximumBinaryString(String binary) {
        char[] b = binary.toCharArray();
        for (int i = b.length - 1; i > 0; i--) {
            if (b[i - 1] == '1' && b[i] == '0') {
                b[i - 1] = '0';
                b[i] = '1';
            }
        }
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i + 1] == '0' && b[i] == '0') b[i] = '1';
        }
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        System.out.println(maximumBinaryString("01"));
    }
}
