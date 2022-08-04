package USACO.Bronze._19_20.Feb;

import java.io.File;
import java.io.FileNotFoundException;
// import java.util.Arrays;
// import java.util.Comparator;
import java.util.Scanner;

public class Triangles {

    /* v1 - Fast (optimized brute force) but works only on 2/10 testcases (bug unknown)

    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 3; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/triangles_bronze_feb20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/triangles_bronze_feb20/" + rep + ".out"));
            int n = scanner.nextInt();
            int[][] posts = new int[n][2];
            for (int i = 0; i < n; i++) {
                posts[i][0] = scanner.nextInt();
                posts[i][1] = scanner.nextInt();
            }
            Arrays.sort(posts, Comparator.comparingInt(a -> a[0]));
            for (int[] i : posts) System.out.println(Arrays.toString(i));
            long largest = 0;
            int x = posts[0][0], x1 = posts[0][1], x2 = posts[0][1];
            for (int i = 1; i <= n; i++) {
                if (i == n ||  posts[i][0] != x) {
                    if (x2 - x1 != 0) {
                        int diff = 0;
                        for (int[] j : posts) {
                            if (j[1] == x1 && Math.abs(j[0] - x) > diff) diff = Math.abs(j[0] - x);
                            else if (j[1] == x2 && Math.abs(j[0] - x) > diff) diff = Math.abs(j[0] - x);
                        }
                        if ((long) diff * (x2 - x1) > largest) {
                            largest = (long) diff * (x2 - x1);
                        }
                    }
                    if (i == n) break;
                    x = posts[i][0];
                    x1 = posts[i][1];
                }
                x2 = posts[i][1];
            }
            System.out.println(rep + ": " + largest);

            if (largest == checkAns.nextLong()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
     */

    // v2 - pure brute force
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/triangles_bronze_feb20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/triangles_bronze_feb20/" + rep + ".out"));
            int n = scanner.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
            int largest = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || x[i] != x[j]) continue;
                    for (int k = 0; k < n; k++) {
                        if (i == k || y[i] != y[k]) continue;
                        largest = Math.max(largest, Math.abs(x[k] - x[i]) * Math.abs(y[j] - y[i]));
                    }
                }
            }
            System.out.println(rep + ": " + largest);

            if (largest == checkAns.nextLong()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
