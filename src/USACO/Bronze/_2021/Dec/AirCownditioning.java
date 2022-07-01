package USACO.Bronze._2021.Dec;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AirCownditioning {
    public static void main(String[] args) throws IOException {
        for (int r = 1; r < 11; r++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_2021/Dec/prob2_bronze_dec21/" + r + ".in"));
            int n = scanner.nextInt(), count = 0, f = 0;
            int[] o = new int[n];
            for (int i = 0; i < n; i++) o[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) o[i] -= scanner.nextInt();
            for (int i = 0; i < n; i++) if (o[i] == 0) f++;
            while (f < n) {
                for (int i = 0; i < n; i++) {
                    if (o[i] != 0) {
                        count++;
                        if (i < n - 1) if ((o[i + 1] > 0 && o[i] > 0) || (o[i + 1] < 0 && o[i] < 0)) count--;
                        if (o[i] > 0) {
                            o[i]--;
                            if (o[i] == 0) f++;
                        }
                        else if (o[i] < 0) {
                            o[i]++;
                            if (o[i] == 0) f++;
                        }
                    }
                }
            }
            System.out.println(r + ": " + count);
            Scanner check = new Scanner(new File("src/USACO/Bronze/_2021/Dec/prob2_bronze_dec21/" + r + ".out"));
            if (count == check.nextLong()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
