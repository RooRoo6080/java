package leetcode;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        return (((n >> 1) + n) & ((n >> 1) + n + 1)) == 0;
    }

    public static void main(String[] args) {
        BinaryNumberWithAlternatingBits bnwab = new BinaryNumberWithAlternatingBits();
        System.out.println(bnwab.hasAlternatingBits(7));
    }
}