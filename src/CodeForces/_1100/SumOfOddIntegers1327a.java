package CodeForces._1100;

// NO SOLUTION WORKING (problem error?)

import java.util.Scanner;

public class SumOfOddIntegers1327a {
    /* v1 - failed testcase 3-3166
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), k = scanner.nextInt(), sub = 1;
            if (k > n) {
                System.out.println("NO");
                continue;
            }
            for (int j = 0; j < k - 1; j++) {
                n -= sub;
                sub += 2;
            }
            if (n % 2 == 0 || n < 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    v2 - failed testcase 3-27556
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            if (k * k <= n && (n + k) % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
     */
}
