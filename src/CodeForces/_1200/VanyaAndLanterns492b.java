package CodeForces._1200;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class VanyaAndLanterns492b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
        Arrays.sort(a);
        long max = 0;
        for (int i = 1; i < n; i++) {
            long dist = a[i] - a[i - 1];
            if (dist > max) max = dist;
        }
        System.out.println(Math.max(a[0], Math.max(l - a[n - 1], max / 2.0)));
    }
}
