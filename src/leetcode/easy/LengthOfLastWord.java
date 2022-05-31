package leetcode.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int i;
        s = s.trim();
        for (i=s.length()-1; i>=0; i--) {
            if (Character.toString(s.charAt(i)).equals(" ")) {
                return s.length()-i - 1;
            }
        }
        return s.length()-i - 1;
    }

    public static void main(String[] args) {
        LengthOfLastWord LoLW = new LengthOfLastWord();
        System.out.println(LoLW.lengthOfLastWord("a "));
    }
}
