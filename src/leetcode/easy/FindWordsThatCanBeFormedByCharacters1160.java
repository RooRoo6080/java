package leetcode.easy;

public class FindWordsThatCanBeFormedByCharacters1160 {
    public static int countCharacters(String[] words, String chars) {
        int[] cLetters = new int[26];
        int count = 0;
        for (int i = 0; i < chars.length(); i++) cLetters[chars.charAt(i) - 97]++;
        for (String i : words) {
            boolean c = true;
            int[] curr = cLetters.clone();
            for (int j = 0; j < i.length(); j++) {
                curr[i.charAt(j) - 97]--;
                if (curr[i.charAt(j) - 97] < 0) {
                    c = false;
                    break;
                }
            }
            if (c) count += i.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        System.out.println(countCharacters(words, chars));
    }
}
