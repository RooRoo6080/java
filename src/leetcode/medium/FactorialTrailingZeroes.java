package leetcode.medium;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        for(int i = 5; i <= n; i = i * 5){
            res += (n/i);
        }
        return res;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
        System.out.println(ftz.trailingZeroes(12));
    }
}
