package USACO.Bronze._19_20.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SocialDistancingII {
    // 7/10
    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_19_20/USopen/socdist2_bronze_open20/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count = 1;
            int[][] cows = new int[n][2];
            for (int i = 0; i < n; i++) {
                cows[i][0] = scanner.nextInt();
                cows[i][1] = scanner.nextInt();
            }
            Arrays.sort(cows, Comparator.comparingInt(a -> a[0]));
            for (int[] i : cows) System.out.println(Arrays.toString(i));
            int r = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (cows[i][1] == 0) {
                    int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE; // tweak for 100%
                    if (i > 0 && cows[i - 1][1] != 0) a = cows[i][0] - cows[i - 1][0];
                    if (i < n - 1 && cows[i + 1][1] != 0) b = cows[i + 1][0] - cows[i][0];
                    r = Math.min(r, Math.min(a, b));
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (cows[i][1] != 0 && (cows[i + 1][1] == 0 || cows[i + 1][0] - cows[i][0] >= r)) count++;
            }

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(c + "/" + 10);
    }
}
