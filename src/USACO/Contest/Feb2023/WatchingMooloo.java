package USACO.Contest.Feb2023;

import java.util.Scanner;

public class WatchingMooloo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(), k = scanner.nextLong();
        long c = 0;
        c += k + 1;
        long last = scanner.nextLong();
        if (n == 1) {
            System.out.println(c);
            return;
        }
        for (long i = 0; i < n - 1; i++) {
            long a = scanner.nextLong();
            if ((c + (a - last)) <= (c + (k + 1))) c += (a - last);
            else c += (k + 1);
        }
        System.out.println(c);
    }
}
