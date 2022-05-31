package leetcode.easy;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> combos = new HashSet<>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(letters[s.charAt(i) - 97]);
            }
            combos.add(sb.toString());
        }
        return combos.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords umcw = new UniqueMorseCodeWords();
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(umcw.uniqueMorseRepresentations(words));
    }
}
