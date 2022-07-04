package USACO.Bronze._21_22.Dec;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WalkingHome {
    public static void main(String[] args) throws IOException {
        for (int r = 1; r < 11; r++) {
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Dec/prob3_bronze_dec21/" + r + ".in"));
            Scanner check = new Scanner(new File("src/USACO/Bronze/_21_22/Dec/prob3_bronze_dec21/" + r + ".out"));
            int correct = 0;
            long startTime = System.currentTimeMillis();
            int t = scanner.nextInt();
            System.out.println("--" + r + "--");
            for (int x = 0; x < t; x++) {
                int n = scanner.nextInt(), k = scanner.nextInt();
                char[][] g = new char[n][n];
                for (int i = 0; i < n; i++) g[i] = scanner.next().toCharArray();
                int ret = 0;
                if (k >= 1) {
                    boolean upRight = true;
                    boolean downLeft = true;
                    for (int i = 0; i < n; i++) {
                        if (g[0][i] == 'H' || g[i][n-1] == 'H') upRight = false;
                        if (g[i][0] == 'H' || g[n-1][i] == 'H') downLeft = false;
                    }
                    if (upRight) ret++;
                    if (downLeft) ret++;
                }
                if (k >= 2) {
                    for (int j = 1; j < n-1; j++) {
                        boolean valid = true;
                        for (int i = 0; i < n; i++) {
                            if (g[i][j] == 'H') valid = false;
                            if (i < j && g[0][i] == 'H') valid = false;
                            if (i > j && g[n-1][i] == 'H') valid = false;
                        }
                        if (valid) ret++;
                    }
                    for (int i = 1; i < n-1; i++) {
                        boolean valid = true;
                        for (int j = 0; j < n; j++) {
                            if (g[i][j] == 'H') valid = false;
                            if (j < i && g[j][0] == 'H') valid = false;
                            if (j > i && g[j][n-1] == 'H') valid = false;
                        }
                        if (valid) ret++;
                    }
                }
                if (k >= 3) {
                    for (int i = 1; i < n-1; i++) {
                        for (int j = 1; j < n-1; j++) {
                            boolean valid = g[i][j] == '.';
                            for (int a = 0; a < n; a++) {
                                if (a <= i && g[a][j] == 'H') valid = false;
                                if (a >= i && g[a][n-1] == 'H') valid = false;
                                if (a <= j && g[0][a] == 'H') valid = false;
                                if (a >= j && g[i][a] == 'H') valid = false;
                            }
                            if (valid) ret++;
                            valid = g[i][j] == '.';
                            for (int a = 0; a < n; a++) {
                                if (a <= i && g[a][0] == 'H') valid = false;
                                if (a >= i && g[a][j] == 'H') valid = false;
                                if (a <= j && g[i][a] == 'H') valid = false;
                                if (a >= j && g[n-1][a] == 'H') valid = false;
                            }
                            if (valid) ret++;
                        }
                    }
                }
                System.out.println(ret);
                if (ret == check.nextInt()) correct++;
            }
            if (correct == t) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
