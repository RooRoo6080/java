package leetcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int output = 0;
        int i;
        int j = x;
        while (x != 0) {
            i = x % 10;
            x /= 10;
            output = output * 10 + i;
        }
        return output == j;
    }

    public static void main(String[] args) {
        int num = -14341;
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(num));
    }
}
