package USACO.Bronze._19_20.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Race {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Jan/race_bronze_jan20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Jan/race_bronze_jan20/" + rep + ".out"));
            int k = scanner.nextInt(), n = scanner.nextInt(), count = 0;
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt(), l = 0, r = 0, t = 0;
                for(int curr = 1;; curr++) {
                    l += curr;
                    t++;
                    if(l + r >= k) break;
                    if(curr >= x) {
                        r += curr;
                        t++;
                        if(l + r >= k) break;
                    }
                }
                System.out.println(t);
                if (t == checkAns.nextInt()) count++;
            }
            if (count == n) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
