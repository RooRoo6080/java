package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("speeding.in"));
        FileWriter writer = new FileWriter("speeding.out");
        int n = scanner.nextInt(), m = scanner.nextInt(), c = 0, ans = 0;
        int[] limit = new int[100];
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt(), sl = scanner.nextInt();
            for (int j = 0; j < l; j++) {
                limit[c] = sl;
                c++;
            }
        }
        c = 0;
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt(), sl = scanner.nextInt();
            for (int j = 0; j < l; j++) {
                if (sl - limit[c] > ans) {
                    ans = sl - limit[c];
                }
                c++;
            }
        }

        writer.write(String.valueOf(ans));
        writer.close();
    }
}
