package leetcode.medium;

public class BulbSwitcher319 {
//    public static int bulbSwitch(int n) {
//        int ans = 0;
//        for (int i = 1; i <= n; i++) {
//            int c = 0;
//            for (int j = 1; j <= n; j++) {
//                if (i % j == 0) c++;
//            }
//            if (c % 2 != 0) ans++;
//        }
//        return ans;
//    }

    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        System.out.println(bulbSwitch(113432));
    }
}
