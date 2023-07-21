package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintWordsVertically1324 {
    public static List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] words = s.split(" ");
        int max = Arrays.stream(words).map(String::length).max(Integer::compareTo).get();
        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i >= word.length()) sb.append(" ");
                else sb.append(word.charAt(i));
            }
            ans.add(sb.toString().stripTrailing());
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(printVertically("CONTEST IS COMING"));
    }
}
