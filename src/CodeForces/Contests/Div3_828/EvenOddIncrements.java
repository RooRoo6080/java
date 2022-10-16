package CodeForces.Contests.Div3_828;

import java.util.Scanner;

public class EvenOddIncrements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), q = scanner.nextInt();
            long[] a = new long[n];
            int odd = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                odd += a[i] % 2;
                sum += a[i];
            }
            for (int i = 0; i < q; i++) {
                long tj = scanner.nextInt(), xj = scanner.nextInt();
                if (tj == 1) {
                    sum += xj * odd;
                    if (xj % 2 == 1) odd = 0;
                }
                else {
                    sum += xj * (n - odd);
                    if (xj % 2 == 1) odd = n;
                }
                System.out.println(sum);
            }
        }
    }
}
