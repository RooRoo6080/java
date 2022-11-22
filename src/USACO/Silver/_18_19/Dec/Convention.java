package USACO.Silver._18_19.Dec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Convention {
    public static boolean check (int i, int[] t, int m, int c) {
        int b = 1;
        for (int j = 1; j < t.length; j++) {
            if (t[j] - t[j - 1] <= i && b < c) b++;
            else {
                m--;
                b = 1;
                if (j == t.length - 1) m--;
            }
            if (m < 0) return false;
        }
        return m >= 0;
    }

    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(new File("convention.in"));
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("convention.out");
        int n = scanner.nextInt(), m = scanner.nextInt(), c = scanner.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) t[i] = scanner.nextInt();
        Arrays.sort(t);
        for (int i = 0; i < t[n - 1] - t[0]; i++) {
            if (check(i, t, m, c)) {
                writer.write(String.valueOf(i));
                System.out.println(i);
                break;
            }
        }
        writer.close();
    }
}
