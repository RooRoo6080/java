package leetcode.easy;

public class ReverseBits190 {
    public static int reverseBits(int n) {
        int r = 0;
        String[] d = String.valueOf(n).split("");
        for (int i = 0; i < d.length; i++) {
            r += Integer.parseInt(d[i]) * java.lang.Math.pow(2, i);
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(110101));
    }
}

