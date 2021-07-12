package leetcode;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sub = new StringBuilder();
        for (int i = 0; i < s.length()/2; i++) {
            sub.append(s.charAt(i));
            if (sub.toString().repeat(s.length()/(i + 1)).equals(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();
        System.out.println(rsp.repeatedSubstringPattern("abab"));
    }

}
