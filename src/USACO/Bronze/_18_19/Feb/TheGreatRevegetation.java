package USACO.Bronze._18_19.Feb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheGreatRevegetation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("revegetate.in"));
        FileWriter writer = new FileWriter("revegetate.out");
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] a = new int[m + 1], b = new int[m + 1], g = new int[n + 1];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            if (a[i] > b[i]) {
                int t = a[i];
                a[i] = b[i];
                b[i] = t;
            }
        }
        for (int i = 1; i <= n; i++) {
            int j;
            for (j = 1; j <= 4; j++) {
                boolean c = true;
                for (int l = 0; l < m; l++) {
                    if (b[l] == i && g[a[l]] == j) c = false;
                }
                if (c) break;
            }
            g[i] = j;
            writer.write(String.valueOf(j));
        }
        writer.close();
    }
}
