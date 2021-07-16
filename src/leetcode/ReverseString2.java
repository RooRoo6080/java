package leetcode;

public class ReverseString2 {
    public String reverseStr(String s, int k) {
        char[] ans = s.toCharArray();
        for (int i = 0; i < ans.length; i += 2 * k) {
            int x = i, y = Math.min(x + k - 1, ans.length - 1);
            while (x < y) {
                char temp = ans[x];
                ans[x++] = ans[y];
                ans[y--] = temp;
            }
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        ReverseString2 rs2 = new ReverseString2();
        System.out.println(rs2.reverseStr("hello", 2));
    }
}
