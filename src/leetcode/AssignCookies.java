package leetcode;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0 ; count < g.length && i < s.length; i++) {
            if (g[count] <= s[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        AssignCookies ac = new AssignCookies();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(ac.findContentChildren(g, s));
    }
}
