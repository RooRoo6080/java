package leetcode;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int upper = 0, lower = 0, first = 0;
        if (Character.isUpperCase(word.charAt(0))) first += 2;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                upper--;
                lower++;
                first++;
            }
        }
        return upper == 0 || lower == word.length() || first == word.length() + 1;
    }

    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();
        System.out.println(dc.detectCapitalUse("g"));
    }
}
