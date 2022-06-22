package CodeForces._1200;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class BerSUBall489b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = scanner.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (i >= m) break;
            if (Math.abs(b[i] - a[j]) <= 1) {
                count++;
                i++;
            } else if (b[i] < a[j]) {
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
