package leetcode;

public class NumberComplement {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toBinaryString(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') sb.append(0);
            else sb.append(1);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        NumberComplement nc = new NumberComplement();
        System.out.println(nc.findComplement(2));
    }
}
