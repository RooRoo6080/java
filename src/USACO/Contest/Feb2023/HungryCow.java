package USACO.Contest.Feb2023;

import java.io.IOException;
import java.util.Scanner;

public class HungryCow {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(), t = scanner.nextLong();
        long c = 0;
        long lastA = 0, lastB = 0;
        for (long i = 0; i < n; i++) {
            long a = scanner.nextLong(), b = scanner.nextLong();
            if (a <= lastA + lastB) c--;
            c += Math.min(Math.max(0, t - a + 1), b);
            lastA = a;
            lastB = b;
        }
        System.out.println(c);
    }
}
