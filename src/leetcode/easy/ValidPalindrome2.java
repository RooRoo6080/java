package leetcode.easy;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int i = -1, j = s.length();
        while (++i < --j)
            if (s.charAt(i) != s.charAt(j)) return isPalindrome(s, i, j + 1) || isPalindrome(s, i - 1, j);
        return true;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (++i < --j)
            if (s.charAt(i) != s.charAt(j)) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome2 vp2 = new ValidPalindrome2();
        System.out.println(vp2.validPalindrome("abca"));
        System.out.println();
    }
}
