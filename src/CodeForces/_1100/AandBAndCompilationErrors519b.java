package CodeForces._1100;

import java.util.Scanner;

public class AandBAndCompilationErrors519b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) a += scanner.nextLong();
        for (int i = 0; i < n - 1; i++) b += scanner.nextLong();
        for (int i = 0; i < n - 2; i++) c += scanner.nextLong();
        System.out.println(a - b);
        System.out.println(b - c);
    }
}
