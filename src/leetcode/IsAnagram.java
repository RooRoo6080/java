package leetcode;

import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> numOfChars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (numOfChars.containsKey(c)) numOfChars.put(c, numOfChars.get(c)+1);
            else numOfChars.put(c, 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (numOfChars.containsKey(c)) numOfChars.put(c, numOfChars.get(c)-1);
            else return false;
            if (numOfChars.get(c) <= 0) numOfChars.remove(c);
        }
        return numOfChars.isEmpty();
    }

    public static void main(String[] args) {
        IsAnagram ia = new IsAnagram();
        String s = "rat";
        String t = "car";
        System.out.println(ia.isAnagram(s, t));
    }
}
