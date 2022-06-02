package leetcode.easy;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        System.out.println(vps.isPerfectSquare(4));
    }
}
