package leetcode.medium;
import java.util.List;

public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] validToPoint = new boolean[s.length() + 1];
        validToPoint[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (validToPoint[j] && wordDict.contains(s.substring(j, i))) {
                    validToPoint[i] = true;
                    break;
                }
            }
        }
        return validToPoint[s.length()];
    }
}
