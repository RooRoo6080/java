package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInDictionary720 {
    static class Trie {
        Trie[] children = new Trie[26];
        boolean isEndOfWord;
        Trie(){
            isEndOfWord = false;
            for (int i = 0; i < 26; i++)
                children[i] = null;
        }
    }
    static Trie root;
    static int longest = 0;
    static String word = "";
    static void insert(String key) {
        int level, added = 0;
        Trie pCrawl = root;

        for (level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null) {
                if (level + 1 < key.length()) return;
                pCrawl.children[index] = new Trie();
                added++;
            }
            if (added < 1) pCrawl = pCrawl.children[index];
            else break;
        }
        level = key.length();
        pCrawl.isEndOfWord = true;
        if (level > longest) {
            longest = level;
            word = key;
        } else if (level == longest) {
            if (word.compareTo(key) > 0) word = key;
        }
    }

    public static String longestWord(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        root = new Trie();
        for (String s : words) insert(s);
        return word;
    }

    public static void main(String[] args) {
        String[] words = {"ts","e","x","pbhj","opto","xhigy","erikz","pbh","opt","erikzb","eri","erik","xlye","xhig","optoj","optoje","xly","pb","xhi","x","o"};
        System.out.println(longestWord(words));
    }
}
