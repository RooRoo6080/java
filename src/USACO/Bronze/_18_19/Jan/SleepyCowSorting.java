package USACO.Bronze._18_19.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SleepyCowSorting {
    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 13; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Jan/sleepy_bronze_jan19/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count = n - 1;
            int[] cows = new int[n + 1];
            for (int i = 0; i < n; i++) cows[i] = scanner.nextInt();
            for (int i = n - 2; i >= 0; i--) {
                if (cows[i] < cows[i + 1]) count = i;
                else break;
            }

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(c + "/" + 12);
    }
}
