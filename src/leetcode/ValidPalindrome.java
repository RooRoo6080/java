package leetcode;

import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        String filtered = "";
        String reversed = "";
        String regex = "^[a-z0-9]*$";
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i)).toLowerCase(Locale.ROOT);
            if (letter.matches(regex)) {
                filtered = filtered + letter;
                reversed = letter + reversed;
            }
        }
        return filtered.equals(reversed);
    }

    public static void main(String[] args){
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }
    //only alphanumeric characters
    //ignores cases
}
