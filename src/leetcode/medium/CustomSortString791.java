package leetcode.medium;

public class CustomSortString791 {
    public static String customSortString(String order, String s) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) letters[s.charAt(i) - 97]++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            sb.append(String.valueOf(order.charAt(i)).repeat(Math.max(0, letters[order.charAt(i) - 97])));
            letters[order.charAt(i) - 97] = 0;
        }
        for (int i = 0; i < letters.length; i++) {
            sb.append(String.valueOf((char) (i + 97)).repeat(Math.max(0, letters[i])));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(customSortString("cbafg", "abcd"));
    }
}
