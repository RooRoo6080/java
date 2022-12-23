package leetcode.algorithm;

public class FirstBadVersion278 {
    static boolean isBadVersion(int version) {return true;}
    public static int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
