package leetcode.easy;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sNum = 0, tNum = 0;
        for (int i = 0; i < s.length(); i++) sNum += s.charAt(i);
        for (int i = 0; i < t.length(); i++) tNum += t.charAt(i);
        return (char) (tNum - sNum);
    }

    public static void main(String[] args) {
        FindTheDifference ftd = new FindTheDifference();
        String s = "abcd";
        String t = "acbde";
        System.out.println(ftd.findTheDifference(s, t));
    }
}
