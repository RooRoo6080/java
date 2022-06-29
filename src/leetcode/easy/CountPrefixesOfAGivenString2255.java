package leetcode.easy;

public class CountPrefixesOfAGivenString2255 {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String i : words) if (i.length() <= s.length() && i.equals(s.substring(0, i.length()))) count++;
        return count;
    }

    public static void main(String[] args) {
        CountPrefixesOfAGivenString2255 cpoags = new CountPrefixesOfAGivenString2255();
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(cpoags.countPrefixes(words, s));
    }
}
