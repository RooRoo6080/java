package leetcode.medium;

import java.util.Stack;

public class RemovingStarsFromAString2390 {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*') stack.pop();
            else stack.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) res.append(stack.pop());
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
