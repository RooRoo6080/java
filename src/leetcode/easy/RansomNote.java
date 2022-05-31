package leetcode.easy;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            int amount = 0;
            if (count.containsKey(magazine.charAt(i))) amount = count.get(magazine.charAt(i));
            count.put(magazine.charAt(i), ++amount);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!count.containsKey(ransomNote.charAt(i)) || count.get(ransomNote.charAt(i)) == 0) return false;
            count.put(ransomNote.charAt(i), count.get(ransomNote.charAt(i)) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        String magazine = "aab";
        String ransomNote = "aa";
        System.out.println(rn.canConstruct(ransomNote, magazine));
    }
}
