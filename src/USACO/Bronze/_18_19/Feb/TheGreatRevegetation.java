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
        int[] a = new int[m], b = new int[m], g = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            if (a[i] > b[i]) {
                int t = a[i];
                a[i] = b[i];
                b[i] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < 4; j++) {
                for (int l = 0; l < m; l++) {
                    if (b[l] != i || g[a[l]] != j) break;
                }
            }
            g[i] = j;
            writer.write(String.valueOf(j));
        }
        writer.close();
    }
}
