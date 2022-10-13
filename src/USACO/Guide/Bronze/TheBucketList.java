package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheBucketList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("blist.in"));
        FileWriter writer = new FileWriter("blist.out");
        int n = scanner.nextInt(), max = 0;
        int[] timings = new int[1000];
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt() - 1, t = scanner.nextInt() - 1, b = scanner.nextInt();
            for (int j = s; j <= t; j++) {
                timings[j] += b;
                if (timings[j] > max) max = timings[j];
            }
        }

        writer.write(String.valueOf(max));
        writer.close();
    }
}
