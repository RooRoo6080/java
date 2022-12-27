package leetcode.algorithm;

import java.util.Arrays;

public class ReverseWordsInAStringIII557 {
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for (String i : split) {
            char[] j = i.toCharArray();
            int left = 0, right = j.length - 1;
            while (left < right) {
                char temp = j[left];
                j[left++] = j[right];
                j[right--] = temp;
            }
            sb.append(new String(j));
            if (c++ < split.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
