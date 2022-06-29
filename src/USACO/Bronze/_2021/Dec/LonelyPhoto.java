package USACO.Bronze._2021.Dec;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LonelyPhoto {
    public static void main(String[] args) throws IOException {
        for (int r = 1; r < 12; r++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_2021/Dec/prob1_bronze_dec21/" + r + ".in"));
            int n = scanner.nextInt();
            char[] s = scanner.next().toCharArray();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int g = 0, h = 0;
                for (int j = i; j < n; j++) {
                    if (s[j] == 'H') h++;
                    else g++;
                    if (h + g >= 3 && (h == 1 || g == 1)) count++;
                    else if (h > 1 && g > 1) break;
                }
            }
            System.out.println(r + ": " + count);
            Scanner check = new Scanner(new File("src/USACO/Bronze/_2021/Dec/prob1_bronze_dec21/" + r + ".out"));
            if (count == check.nextLong()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
