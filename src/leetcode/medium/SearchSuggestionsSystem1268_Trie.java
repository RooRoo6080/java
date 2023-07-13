package leetcode.medium;

import java.util.*;

public class SearchSuggestionsSystem1268_Trie {
    static class Trie {
        Trie[] sub = new Trie[26];
        LinkedList<String> suggestion = new LinkedList<>();
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie root = new Trie();
        for (String p : products) insert(p, root);
        return search(searchWord, root);
    }

    private void insert (String p, Trie root) {
        Trie t = root;
        for (char c : p.toCharArray()) {
            if (t.sub[c - 'a'] == null) t.sub[c - 'a'] = new Trie();
            t = t.sub[c - 'a'];
            t.suggestion.offer(p);
            Collections.sort(t.suggestion);
            if (t.suggestion.size() > 3) t.suggestion.pollLast();
        }
    }

    private List<List<String>> search (String searchWord, Trie root) {
        List<List<String>> ans = new ArrayList<>();
        for (char c : searchWord.toCharArray()) {
            if (root != null) root = root.sub[c = 'a'];
            ans.add(root == null ? Arrays.asList() : root.suggestion);
        }
        return ans;
    }
}
