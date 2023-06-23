package leetcode.easy;

public class Largest3SameDigitNumberInString2264 {
    public static String largestGoodInteger(String num) {
        char[] s = num.toCharArray();
        char l = ' ';
        for (int i = 0; i < s.length - 2; i++) {
            if (s[i] == s[i + 1] && s[i] == s[i + 2] && s[i] > l) l = s[i];
        }
        return ("" + l + l + l).strip();
    }

    public static void main(String[] args) {
        String num = "42352338";
        System.out.println(largestGoodInteger(num));
    }
}
