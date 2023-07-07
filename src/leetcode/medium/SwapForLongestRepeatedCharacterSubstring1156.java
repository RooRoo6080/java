package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SwapForLongestRepeatedCharacterSubstring1156 {
    public static int maxRepOpt1(String text) {
        int[] charCount = new int[26];
        List<int[]> combos = new ArrayList<>();
        int c = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i < text.length()) charCount[text.charAt(i) - 'a']++;
            if (i == text.length() || text.charAt(i) != text.charAt(c)) {
                combos.add(new int[]{text.charAt(c), i - c});
                c = i;
            }
        }
        c = 0;
        for (int i = 0; i < combos.size(); i++) {
            int l = combos.get(i)[1];
            if (i + 2 < combos.size() && combos.get(i + 2)[0] == combos.get(i)[0] && combos.get(i + 1)[1] == 1)
                l += combos.get(i + 2)[1];
            c = Math.max(c, l + (l < charCount[combos.get(i)[0] - 'a'] ? 1 : 0));
        }
        return c;
    }
}
