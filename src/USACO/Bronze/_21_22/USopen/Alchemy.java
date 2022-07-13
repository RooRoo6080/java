package USACO.Bronze._21_22.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// 4/11 correct

public class Alchemy {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 12; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/USopen/prob3_bronze_open22/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/USopen/prob3_bronze_open22/" + rep + ".out"));
            int n = scanner.nextInt();
            int[] metals = new int[n];
            for (int i = 0; i < n; i++) metals[i] = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] recipes = new int[k][101];
            for (int i = 0; i < k; i++) {
                recipes[i][0] = scanner.nextInt();
                recipes[i][1] = scanner.nextInt();
                for (int j = 2; j < recipes[i][1] + 2; j++) {
                    recipes[i][j] = scanner.nextInt();
                }
            }
            Arrays.sort(recipes, java.util.Comparator.comparingInt(a -> a[0]));
            for (int r = 0; r < k; r++) {
                for (int i = 0; i < k; i++) {
                    if (recipes[i][0] <= n) {
                        int count = 0, lowest = 10000;
                        for (int j = 2; j < recipes[i][1] + 2; j++) {
                            if (metals[recipes[i][j] - 1] > 0) count++;
                            if (metals[recipes[i][j] - 1] < lowest) lowest = metals[recipes[i][j] - 1];
                        }
                        if (count == recipes[i][1]) {
                            while (lowest-- > 0) {
                                for (int j = 2; j < recipes[i][1] + 2; j++) {
                                    metals[recipes[i][j] - 1]--;
                                }
                                metals[recipes[i][0] - 1]++;
                            }
                        }
                    }
                }
            }

            System.out.println(rep + ": " + metals[n - 1]);

            int ans = checkAns.nextInt();
            if (metals[n - 1] == ans) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG - " + ans + "\n");
        }
    }
}
