package leetcode.medium;

public class MaximumProductOfWordLengths318 {
    public static int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            int[] chars = new int[26];
            for (char a : words[i].toCharArray()) chars[a - 'a']++;
            for (int j = i + 1; j < words.length; j++) {
                boolean b = true;
                for (char a : words[j].toCharArray()) {
                    if (chars[a - 'a'] > 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    max = Math.max(max, words[i].length() * words[j].length());
                    //System.out.println(words[i] + " " + words[j]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] w = {"a","aa","aaa","aaaa"};
        System.out.println(maxProduct(w));
    }
}
