package leetcode.easy;

public class CheckIfStringIsPrefixOfArray1961 {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String i : words) {
            sb.append(i);
            if (sb.toString().equals(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s, words));
    }
}
