package leetcode.easy;

public class LongestUncommonSubsequence1 {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        LongestUncommonSubsequence1 lus1 = new LongestUncommonSubsequence1();
        String a = "agfa";
        String b = "adgfa";
        System.out.println(lus1.findLUSlength(a, b));
    }
}
