package leetcode;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String s = Integer.toBinaryString(x ^ y);
        x = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == '1') x++;
        return x;
    }

    public static void main(String[] args) {
        HammingDistance hd = new HammingDistance();
        int x = 1;
        int y = 4;
        System.out.println(hd.hammingDistance(x, y));
    }
}
