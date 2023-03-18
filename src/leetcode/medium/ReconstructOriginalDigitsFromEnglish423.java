package leetcode.medium;

public class ReconstructOriginalDigitsFromEnglish423 {
    public static String originalDigits(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 97]++;
        }
        String[] letters = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            int max = Integer.MAX_VALUE;
            for (int j = 0; j < letters[i].length(); j++) {
                max = Math.min(max, chars[letters[i].charAt(j) - 97]);
            }
            for (int j = 0; j < letters[i].length(); j++) {
                for (int k = 0; k < max; k++) chars[letters[i].charAt(j) - 97]--;
            }
            sb.append(String.valueOf(i).repeat(Math.max(0, max)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "owoztneoer";
        System.out.println(originalDigits(s));
    }
}
