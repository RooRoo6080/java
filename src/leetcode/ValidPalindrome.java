package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
            while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) end--;
            if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }
    //only alphanumeric characters
    //ignores cases
}
