package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            String thing = map[digits.charAt(i) - '0'];
            List<String> result = new ArrayList<>();
            for (int j = 0; j < thing.length(); j++) for (String x : ans) result.add(x + thing.charAt(j));
            ans = result;
        }
        return ans;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber lcoapn = new LetterCombinationsOfAPhoneNumber();
        System.out.println(Arrays.toString(lcoapn.letterCombinations("23").toArray()));
    }
}
