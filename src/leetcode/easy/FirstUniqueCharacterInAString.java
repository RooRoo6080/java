package leetcode.easy;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> appearances = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            if (appearances.containsKey(s.charAt(i))) count += appearances.get(s.charAt(i));
            appearances.put(s.charAt(i), count);
        }
        for (int i = 0; i < s.length(); i++) {
            if (appearances.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString fucias = new FirstUniqueCharacterInAString();
        System.out.println(fucias.firstUniqChar("hello"));
    }
}
