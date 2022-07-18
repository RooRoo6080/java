package USACO.Bronze._20_21.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JustStalling {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 13; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Jan/prob3_bronze_jan21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Jan/prob3_bronze_jan21/" + rep + ".out"));
            int n = scanner.nextInt();
            long count = 1;
            long[] cows = new long[n], stalls = new long[n];
            for (int i = 0; i < n; i++) cows[i] = scanner.nextLong();
            for (int i = 0; i < n; i++) stalls[i] = scanner.nextLong();
            Arrays.sort(cows);
            Arrays.sort(stalls);
            for (int i = n - 1; i >= 0; i--) {
                int c = 0;
                for (int j = i; j >= 0; j--) {
                    if (cows[i] <= stalls[j]) c++;
                    else break;
                }
                count *= c;
            }
            System.out.println(rep + ": " + count);

            if (count == checkAns.nextLong()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
