package leetcode.easy;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int count = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) count += i;
        }
        return count == num;
    }

    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        System.out.println(pn.checkPerfectNumber(28));
    }
}
