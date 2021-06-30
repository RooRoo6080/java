package leetcode;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> matches = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (matches.containsKey(s.charAt(i))) {
                if (!matches.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }
            else if (!matches.containsValue(t.charAt(i))) matches.put(s.charAt(i), t.charAt(i));
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        String s = "paper";
        String t = "title";
        System.out.println(is.isIsomorphic(s, t));
    }
}
