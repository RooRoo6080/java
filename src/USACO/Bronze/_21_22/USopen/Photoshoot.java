package USACO.Bronze._21_22.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Photoshoot {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 12; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/USopen/prob1_bronze_open22/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/USopen/prob1_bronze_open22/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            char[] cows = scanner.next().toCharArray();
            for (int i = n - 2; i >= 0; i -= 2) if (cows[i] != cows[i + 1] && (cows[i] == 'G') == (count % 2 == 0)) count++;
            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
