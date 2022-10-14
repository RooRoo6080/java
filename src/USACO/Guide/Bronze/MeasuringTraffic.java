package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MeasuringTraffic {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("traffic.in"));
        FileWriter writer = new FileWriter("traffic.out");
        int n = scanner.nextInt();
        String[] type = new String[n];
        int[] lower = new int[n], upper = new int[n];
        for (int i = 0; i < n; i++) {
            type[i] = scanner.next();
            lower[i] = scanner.nextInt();
            upper[i] = scanner.nextInt();
        }
        long min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (type[i].equals("none")) {
                min = Math.max(min, lower[i]);
                max = Math.min(max, upper[i]);
            }
            else if (type[i].equals("off")) {
                min += lower[i];
                max += upper[i];
            }
            else {
                min -= upper[i];
                max -= lower[i];
                min = Math.max(0, min);
            }
        }
        writer.write(min + " " + max + "\n");
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (type[i].equals("none")) {
                min = Math.max(min, lower[i]);
                max = Math.min(max, upper[i]);
            }
            else if (type[i].equals("off")) {
                min -= upper[i];
                max -= lower[i];
                min = Math.max(0, min);
            }
            else {
                min += lower[i];
                max += upper[i];
            }
        }

        writer.write(min + " " + max);
        writer.close();
    }
}
