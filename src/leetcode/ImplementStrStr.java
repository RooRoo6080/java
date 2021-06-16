package leetcode;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle) || needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr iss = new ImplementStrStr();
        String haystack = "a";
        String needle = "";
        System.out.println(iss.strStr(haystack, needle));
    }
}
