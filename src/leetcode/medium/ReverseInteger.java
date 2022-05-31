package leetcode.medium;

public class ReverseInteger {

    public int reverse(int x) {
        int output = 0;
        int i;
        while (x != 0) {
            i = x % 10;
            x /= 10;
            output = output * 10 + i;
        }
        return output;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(57654));
    }
}
