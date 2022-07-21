package USACO.Bronze._20_21.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ComfortableCows {
    public static void main(String[] args) throws FileNotFoundException {
        int allCorrect = 0;
        for (int rep = 1; rep < 13; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob2_bronze_feb21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob2_bronze_feb21/" + rep + ".out"));
            int n = scanner.nextInt(), c = 0;
            int[][] cows = new int[n][3]; //[i][x, y, sum]
            for (int i = 0; i < n; i++) {
                int count = 0;
                cows[i][0] = scanner.nextInt();
                cows[i][1] = scanner.nextInt();
                for (int j = 0; j < i; j++) {
                    if (Math.sqrt(Math.pow(cows[j][1] - cows[i][1], 2) + Math.pow(cows[j][0] - cows[i][0], 2)) == 1) {
                        cows[i][2]++;
                        cows[j][2]++;
                    }
                    if (cows[j][2] == 3) count++;
                }
                if (cows[i][2] == 3) count++;
                if (count == checkAns.nextInt()) c++;
            }

            if (c == n) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                allCorrect++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(allCorrect + "/" + 12);
    }
}
