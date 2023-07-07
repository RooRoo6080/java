package leetcode.medium;

public class RemoveAllOccurrencesOfASubstring1910 {
    public String removeOccurrences(String s, String part) {
        while (true) {
            if (s.contains(part)) s = s.replaceFirst(part, "");
            else break;
        }
        return s;
    }
}
