package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        ArrayList<String> ans = new ArrayList<>();
        boolean add = true;
        for (String i : words) {
            for (String j : rows) {
                for (int k = 0; k < i.length(); k++) {
                    if (!j.contains(Character.toString(Character.toLowerCase(i.charAt(k))))) add = false;
                }
                if (add) ans.add(i);
                add = true;
            }
        }
        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        KeyboardRow kr = new KeyboardRow();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(kr.findWords(words)));
    }
}
