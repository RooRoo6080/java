package USACO.Bronze._18_19.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShellGame {
    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Jan/shell_bronze_jan19/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count = 0;

            int[][] swaps = new int[n][3];
            for (int i = 0; i < n; i++) for (int j = 0; j < 3; j++) swaps[i][j] = scanner.nextInt();
            for (int i = 1; i <= 3; i++) {
                int curr = 0, location = i;
                for (int[] j : swaps) {
                    if (j[0] == location) location = j[1];
                    else if (j[1] == location) location = j[0];
                    if (j[2] == location) curr++;
                }
                System.out.println(curr);
                if (curr > count) count = curr;
            }

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
