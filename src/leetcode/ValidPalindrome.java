package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        String regex = "^[a-z0-9]*$";
        while (start <= end) {
            String startVar = Character.toString(Character.toLowerCase(s.charAt(start)));
            if (startVar.matches(regex)) {
                String endVar = Character.toString(Character.toLowerCase(s.charAt(end)));
                if (endVar.matches(regex)) {
                    if (!startVar.equals(endVar)) {
                        return false;
                    }
                    start ++;
                    end--;
                } else end --;
            } else start++;
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
