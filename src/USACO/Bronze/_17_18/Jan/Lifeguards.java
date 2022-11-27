package USACO.Bronze._17_18.Jan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lifeguards {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("lifeguards.in"));
        FileWriter writer = new FileWriter("lifeguards.out");
        int n = scanner.nextInt();
        int[][] shifts = new int[n][];
        int max = 0, min = 1000;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            if (max < Math.max(a, b)) max = Math.max(a, b);
            if (min > Math.min(a, b)) min = Math.min(a, b);
            shifts[i] = new int[]{a, b};
        }
        Arrays.sort(shifts, Comparator.comparing(a -> a[0]));
        int[] independentShifts = new int[n];
        for (int i = 0; i < n; i++) {
            int c = shifts[i][1] - shifts[i][0];
            if (i > 0) c -= Math.max(0, shifts[i - 1][1] - shifts[i][0]);
            if (i < n - 1) c -= Math.max(0, shifts[i][1] - shifts[i + 1][0]);
            independentShifts[i] = c;
        }
        Arrays.sort(independentShifts);
        writer.write(String.valueOf(max - min - independentShifts[0]));
        writer.close();
    }
}
