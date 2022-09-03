package USACO.Bronze._18_19.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SleepyCowHerding {
    public static void main(String[] args) throws FileNotFoundException {
        int t = 0;
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Feb/herding_bronze_feb19/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
            int min = 0, max = Math.max(b - a, c - b) - 1;
            if (b - a > 2 || c - b > 2) min = 2;
            if (b - a == 2 || c - b == 2) min = 1;

            System.out.println("-- " + rep + " --");
            System.out.println(min);
            System.out.println(max);
            if (min == checkAns.nextInt() && max == checkAns.nextInt()) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                t++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(t + "/" + 10);
    }
}
