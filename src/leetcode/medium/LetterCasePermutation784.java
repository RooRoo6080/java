package leetcode.medium;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation784 {
    public List<String> letterCasePermutation(String s) {
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) continue;
            int c = q.size();
            for (int j = 0; j < c; j++) {
                String a = q.poll();
                char[] chars = a.toCharArray();
                chars[i] = Character.toUpperCase(chars[i]);
                q.offer(String.valueOf(chars));
                chars[i] = Character.toLowerCase(chars[i]);
                q.offer(String.valueOf(chars));
            }
        }
        return new LinkedList<>(q);
    }
}
