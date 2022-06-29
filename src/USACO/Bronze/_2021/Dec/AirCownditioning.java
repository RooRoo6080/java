package USACO.Bronze._2021.Dec;

// WIP

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AirCownditioning {
    public static void main(String[] args) throws IOException {
        for (int r = 1; r < 11; r++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_2021/Dec/prob2_bronze_dec21/" + r + ".in"));
            int n = scanner.nextInt(), count = 0;
            char[] s = scanner.nextLine().toCharArray();
            char[] p = scanner.nextLine().toCharArray();
            System.out.println(r + ": " + count);
            Scanner check = new Scanner(new File("src/USACO/Bronze/_2021/Dec/prob2_bronze_dec21/" + r + ".out"));
            if (count == check.nextLong()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
