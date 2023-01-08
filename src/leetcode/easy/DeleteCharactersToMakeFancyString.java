package leetcode.easy;

public class DeleteCharactersToMakeFancyString {
    public static String makeFancyString(String s) {
        if (s.length() < 3) return s;
        StringBuilder sb = new StringBuilder();
        char last1 = s.charAt(0), last2 = s.charAt(1);
        sb.append(last1).append(last2);
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) != last1 || s.charAt(i) != last2) sb.append(s.charAt(i));
            last1 = last2;
            last2 = s.charAt(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabaaaa";
        System.out.println(makeFancyString(s));
    }
}
