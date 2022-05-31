package leetcode.easy;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        return pattern(pattern.split("")).equals(pattern(s.split(" ")));
    }

    public static String pattern (String[] split) {
        int count = 0;
        StringBuilder p = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : split) {
            if (!map.containsKey(i)) map.put(i, count++);
            p.append(map.get(i));
        }
        return p.toString();
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        String pattern = "jquery";
        String s = "jquery";
        System.out.println(wp.wordPattern(pattern, s));
    }
}
