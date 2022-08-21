package USACO.Bronze._18_19.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheBucketList {
    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Dec/blist_bronze_dec18/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            int[] logs = new int[1000];
            for (int i = 0; i < n; i++) {
                int s = scanner.nextInt() - 1, t = scanner.nextInt(), b = scanner.nextInt();
                while (s++ < t) logs[s - 1] += b;
            }
            for (int i : logs) if (i > count) count = i;

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(c + "/" + 10);
    }
}
