package CodeForces._1200;

import java.util.Scanner;

public class Worms474b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[1000001];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i]; j++) {
                p[index++] = i + 1;
            }
        }
        for (int i = 0; i < m; i++) System.out.println(p[scanner.nextInt() - 1]);
    }
}
