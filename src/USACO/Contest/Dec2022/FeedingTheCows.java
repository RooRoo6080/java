package USACO.Contest.Dec2022;

import java.util.Arrays;
import java.util.Scanner;

public class FeedingTheCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            String s = scanner.next();
            char[][] m = new char[n][n];
            for (int j = 0; j < n; j++) {
                Arrays.fill(m[j], '.');
                m[j][j] = s.charAt(j);
                for (int l = 1; l <= k; l++) {
                    if (j - l >= 0) m[j][j - l] = s.charAt(j);
                    if (j + l < n) m[j][j + l] = s.charAt(j);
                }
            }
            char[] o = new char[n];
            Arrays.fill(o, '.');
            int r = 0;
            while (r < n) {
                int[] g = new int[n];
                int[] h = new int[n];
                int gm = 0, hm = 0;
                Arrays.fill(g, 0);
                Arrays.fill(h, 0);

                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        if (m[l][j] == 'G') g[j]++;
                        if (m[l][j] == 'H') h[j]++;
                    }
                    if (g[j] > gm) gm = g[j];
                    if (h[j] > hm) hm = h[j];
                }
                boolean ged = false, hed = false;
                for (int j = 0; j < n; j++) {
                    if (g[j] == gm && !ged) {
                        for (int l = 0; l < n; l++) {
                            if (m[l][j] == 'G') {
                                Arrays.fill(m[l], '.');
                                r++;
                                o[j] = 'G';
                                ged = true;
                            }
                        }
                    }
                    if (h[j] == hm && !hed && o[j] == '.') {
                        for (int l = 0; l < n; l++) {
                            if (m[l][j] == 'H') {
                                Arrays.fill(m[l], '.');
                                r++;
                                o[j] = 'H';
                                hed = true;
                            }
                        }
                    }
                }
            }
            int c = 0;
            for (int j = 0; j < n; j++) if (o[j] != '.') c++;
            System.out.println(c);
            System.out.println(String.valueOf(o));
        }
    }
}
