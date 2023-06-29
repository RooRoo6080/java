package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchSuggestionsSystem1268 {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> out = new ArrayList<>();
        List<String> p = new ArrayList<>(Arrays.asList(products));
        for (int i = 1; i <= searchWord.length(); i++) {
            List<String> l = new ArrayList<>();
            for (int j = 0; j < p.size(); j++) {
                if (p.get(j).startsWith(searchWord.substring(0, i))) l.add(p.get(j));
                else {
                    p.remove(p.get(j));
                    j--;
                }
            }
            Collections.sort(l);
            if (l.size() > 3) out.add(l.subList(0, 3));
            else out.add(l);
        }
        return out;
    }

    public static void main(String[] args) {
        String[] p = {"havana"};
        String s = "havana";
        System.out.println(suggestedProducts(p, s));
    }
}
