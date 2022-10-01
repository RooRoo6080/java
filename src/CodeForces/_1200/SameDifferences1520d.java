package CodeForces._1200;

import java.util.Scanner;

public class SameDifferences1520d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), count = 0;
            int[] a = new int[n];
            for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (k - j == a[k] - a[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count + "\n");
        }
    }
}
