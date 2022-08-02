package USACO.Bronze._19_20.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Photoshoot {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Jan/photo_bronze_jan20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Jan/photo_bronze_jan20/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            boolean[] used = new boolean[n + 1];
            int[] b = new int[n - 1];
            int[] order = new int[n];
            for (int i = 0; i < n - 1; i++) b[i] = scanner.nextInt();
            for (int i = 1; i < b[0]; i++) {
                Arrays.fill(used, false);
                order[0] = i;
                order[1] = b[0] - i;
                if (order[1] > n) continue;
                used[i] = true;
                used[order[1]] = true;
                for (int j = 1; j < n - 1; j++) {
                    int t = b[j] - order[j];
                    if (t <= 0 || t >= used.length || used[t]) break;
                    used[t] = true;
                    order[j + 1] = t;
                }
                if (order[n - 1] != 0) break;
            }

            for (int j : order) {
                System.out.print(j + " ");
                if (j == checkAns.nextInt()) count++;
            }
            if (count == n) System.out.println("\nCORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("\nWRONG\n");
        }
    }
}
