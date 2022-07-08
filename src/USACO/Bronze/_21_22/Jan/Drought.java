package USACO.Bronze._21_22.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Drought {
    public static long check (long[] a) {
        long lowest = Long.MAX_VALUE;
        for (long i : a) if (i < lowest) lowest = i;
        return lowest;
    }

    public static void main(String[] args) throws FileNotFoundException {
        for (int r = 1; r < 16; r++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Jan/prob3_bronze_jan22/" + r + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/Jan/prob3_bronze_jan22/" + r + ".out"));
            int t = scanner.nextInt(), c = 0;
            System.out.println("--" + r + "--");
            for (int q = 0; q < t; q++) {
                int n = scanner.nextInt();
                long count = 0;
                long[] h = new long[n];
                for (int i = 0; i < n; i++) h[i] = scanner.nextLong();
                long lowest = check(h);
                while (lowest > -1) {
                    int diff = 0;
                    for (int i = 0; i < n; i++) {
                        if (h[i] > lowest) {
                            diff++;
                            long s = h[i] - lowest;
                            count += s * 2;
                            h[i] -= s;
                            if (i == 0) h[1] -= s;
                            else if (i == n - 1) h[n - 2] -= s;
                            else if (h[i + 1] > h[i - 1]) h[i + 1] -= s;
                            else h[i - 1] -= s;
                        }
                    }
                    lowest = check(h);
                    if (diff == 0) break;
                }
                if (lowest < 0) count = -1;
                System.out.println(count);
                if (count == checkAns.nextLong()) c++;
            }
            if (c == t) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
