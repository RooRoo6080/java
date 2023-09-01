package leetcode.medium;

import java.util.ArrayList;
import java.util.Stack;

public class SmallestSubsequenceOfDistinctCharacters1081 {
//    public static String smallestSubsequence(String s) {
//        int[] arr = new int[26];
//        StringBuilder sb = new StringBuilder();
//        for (char i : s.toCharArray()) {
//            if (arr[i - 'a'] == 0) {
//                arr[i - 'a']++;
//                sb.append(i);
//            }
//        }
//        return sb.toString();
//    }

    public static String smallestSubsequence(String s) {
        Stack<Integer> stack = new Stack<>();
        int[] lastIndexOfChar = new int[26], used = new int[26];
        for (int i = 0; i < s.length(); i++) lastIndexOfChar[s.charAt(i) - 'a'] = i;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (used[c]++ > 0) continue;
            while (!stack.isEmpty() && stack.peek() > c && i < lastIndexOfChar[stack.peek()]) used[stack.pop()] = 0;
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : stack) sb.append((char)('a' + i));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(smallestSubsequence("cbacdcbc"));
    }
}
