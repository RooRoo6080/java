package leetcode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String pre;
        int count = 1;
        while (true) {
            try {
                pre = strs[0].substring(0, count);
                for (String i : strs) {
                    if (!i.substring(0, count).equals(pre)) {
                        return i.substring(0, count - 1);
                    }
                }
                count++;
            } catch (Exception ignored) {
                return strs[0].substring(0, count - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "fleece"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(str));
    }
}
