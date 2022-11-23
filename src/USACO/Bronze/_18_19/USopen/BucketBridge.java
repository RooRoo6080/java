package USACO.Bronze._18_19.USopen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BucketBridge {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("buckets.in"));
        FileWriter writer = new FileWriter("buckets.out");
        int[] b = new int[2], r = new int[2], l = new int[2];
        for (int i = 0; i < 10; i++) {
            String s = scanner.next();
            for (int j = 0; j < 10; j++) {
                if (s.charAt(j) == 'B') b = new int[]{i, j};
                else if (s.charAt(j) == 'R') r = new int[]{i, j};
                else if (s.charAt(j) == 'L') l = new int[]{i, j};
            }
        }
        int ans = Math.abs(b[0] - l[0]) + Math.abs(b[1] - l[1]) - 1;
        if ((b[0] == l[0] && b[0] == r[0] && r[1] > Math.min(b[1], l[1]) && r[1] < Math.max(b[1], l[1])) ||
                (b[1] == l[1] && b[1] == r[1] && r[0] > Math.min(b[0], l[0]) && r[0] < Math.max(b[0], l[0]))) ans += 2;

        writer.write(String.valueOf(ans));
        writer.close();
    }
}
