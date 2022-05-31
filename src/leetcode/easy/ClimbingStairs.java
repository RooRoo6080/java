// this is basically fibonacci

package leetcode.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int x = 0, y = 1, result = 0, count = 0;
        while (count < n) {
            result = x + y;
            x = y;
            y = result;
            count ++;
        }
        return result;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(45));
    }
}