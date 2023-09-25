package USACO.Bronze._22_23.Dec;

import java.util.Arrays;
import java.util.Scanner;
public class FeedingTheCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(), k = scanner.nextInt(), c = n;
            boolean[] g =  new boolean[n];
            boolean[] h = new boolean[n];
            String s = scanner.next();
            char[] out = new char[n];
            Arrays.fill(out, '.');
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'G' && !g[i]) {
                    if (i + k < n) {
                        Arrays.fill(g, i, Math.min(n, i + k * 2 + 1), true);
                        if (out[i + k] == '.') out[i + k] = 'G';
                        else out[i + k - 1] = 'G';
                    } else {
                        Arrays.fill(g, Math.max(0, i - k), Math.min(n, i + k + 1), true);
                        if (out[i] == '.') out[i] = 'G';
                        else out[i - 1] = 'G';
                    }
                } else if (s.charAt(i) == 'H' && !h[i]) {
                    if (i + k < n) {
                        Arrays.fill(h, i, Math.min(n, i + k * 2 + 1), true);
                        if (out[i + k] == '.') out[i + k] = 'H';
                        else out[i + k - 1] = 'H';
                    } else {
                        Arrays.fill(h, Math.max(0, i - k), Math.min(n, i + k + 1), true);
                        if (out[i] == '.') out[i] = 'H';
                        else out[i - 1] = 'H';
                    }
                } else c--;
            }
            System.out.println(c + "\n" + new String(out));
        }
    }
}
