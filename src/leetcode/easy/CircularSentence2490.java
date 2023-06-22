package leetcode.easy;

public class CircularSentence2490 {
    public static boolean isCircularSentence(String sentence) {
        char[] s = sentence.toCharArray();
        if (s[s.length - 1] != s[0]) return false;
        for (int i = 0; i < s.length - 2; i++) {
            if (s[i + 1] == ' ' && s[i + 2] != s[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Leetcode is cool";
        System.out.println(isCircularSentence(s));
    }
}
