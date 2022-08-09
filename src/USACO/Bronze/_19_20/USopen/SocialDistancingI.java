package USACO.Bronze._19_20.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SocialDistancingI {
    // 9/15 correct
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 16; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_19_20/USopen/socdist1_bronze_open20/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count;
            String s = scanner.next() + "1";
            int l1 = 0, l2 = 0, c = 1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    if (s.charAt(i + 1) == '0') c++;
                    else {
                        if (c > l2) {
                            if (c > l1) {
                                l2 = l1;
                                l1 = c;
                            }
                            else l2 = c;
                        }
                        c = 1;
                    }
                }
            }
            count = Math.max((l2 + 1) / 2, (int) Math.round(l1 / 3.0));

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
