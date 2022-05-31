package leetcode.easy;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        digits[index] ++;
        while (digits[index] == 10) {
            digits[index] = 0;
            index --;
            if (index < 0) {
                int[] incDigits = Arrays.copyOf(digits, digits.length + 1);
                incDigits[0] = 1;
                return incDigits;
            }
            digits[index]++;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] num = {9, 9};
        System.out.println(Arrays.toString(po.plusOne(num)));
    }
}