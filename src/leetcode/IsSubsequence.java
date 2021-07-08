package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int sIndex = 0, tIndex = 0;
        while (tIndex < t.length()) {
            if (t.charAt(tIndex++) == s.charAt(sIndex)) {
                if (++sIndex == s.length()) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();
        String s = "";
        String t = "";
        System.out.println(is.isSubsequence(s, t));
    }
}
