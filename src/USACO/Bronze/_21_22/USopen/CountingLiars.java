package USACO.Bronze._21_22.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingLiars {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 13; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/USopen/prob2_bronze_open22/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/USopen/prob2_bronze_open22/" + rep + ".out"));
            int n = scanner.nextInt(), count = 1000;
            String[] letter = new String[n];
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                letter[i] = scanner.next();
                p[i] = scanner.nextInt();
            }
            for (int i : p) {
                int min = 0;
                for (int j = 0; j < n; j++) {
                    if (letter[j].equals("G") && i < p[j]) min++;
                    else if (letter[j].equals("L") && i > p[j]) min++;
                }
                if (min < count) count = min;
            }

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
