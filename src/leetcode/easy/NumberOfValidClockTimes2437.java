package leetcode.easy;

public class NumberOfValidClockTimes2437 {
    public static int countTime(String time) {
        char[] s = time.toCharArray();
        int p = 1;
        if (s[0] == '?' && s[1] == '?') p *= 24;
        else {
            if (s[0] == '?') {
                if (Character.getNumericValue(s[1]) < 4) p *= 3;
                else p *= 2;
            }
            if (s[1] == '?') {
                if (Character.getNumericValue(s[0]) < 2) p *= 10;
                else p *= 4;
            }
        }
        if (s[3] == '?') p *= 6;
        if (s[4] == '?') p *= 10;
        return p;
    }

    public static void main(String[] args) {
        System.out.println(countTime("??:??"));
    }
}
