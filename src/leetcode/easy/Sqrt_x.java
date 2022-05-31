package leetcode.easy;

public class Sqrt_x {
    public int mySqrt(int x) {
        long r = x;
        while (r*r > x) r = (r + x/r) / 2;
        return (int) r;
    }

    public static void main(String[] args) {
        Sqrt_x sqx = new Sqrt_x();
        System.out.println(sqx.mySqrt(43));
    }
}