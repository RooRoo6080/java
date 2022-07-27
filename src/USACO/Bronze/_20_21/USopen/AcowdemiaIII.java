package USACO.Bronze._20_21.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AcowdemiaIII {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 13; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/USopen/prob3_bronze_open21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/USopen/prob3_bronze_open21/" + rep + ".out"));
            int n = scanner.nextInt(), m = scanner.nextInt(), count = 0;
            char[][] pasture = new char[n + 2][];
            pasture[0] = new char[m + 2];
            Arrays.fill(pasture[0], '.');
            pasture[n + 1] = pasture[0];
            for (int y = 1; y <= n; y++) pasture[y] = ('.' + scanner.next() + '.').toCharArray();
            int answer = 0;
            for (int y = 1; y <= n; y++) {
                for (int x = 1; x <= m; x++) {
                    if (pasture[y][x] == 'G' && ((pasture[y][x - 1] == 'C' && pasture[y][x + 1] == 'C') || (pasture[y - 1][x] == 'C' && pasture[y + 1][x] == 'C'))) {
                        pasture[y][x] = '.';
                        answer++;
                    }
                }
            }
            for (int y = 1; y <= n; y++) {
                for (int x = 1; x <= m; x++) {
                    if (pasture[y][x] == 'C') {
                        if (pasture[y + 1][x - 1] == 'C') {
                            if (pasture[y][x - 1] == 'G') {
                                pasture[y][x - 1] = '.';
                                answer++;
                            } else if (pasture[y + 1][x] == 'G') {
                                pasture[y + 1][x] = '.';
                                answer++;
                            }
                        }
                        if (pasture[y + 1][x + 1] == 'C') {
                            if (pasture[y][x + 1] == 'G') {
                                pasture[y][x + 1] = '.';
                                answer++;
                            } else if (pasture[y + 1][x] == 'G') {
                                pasture[y + 1][x] = '.';
                                answer++;
                            }
                        }
                    }
                }
            }

            System.out.println(rep + ": " + answer);
            if (answer == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
