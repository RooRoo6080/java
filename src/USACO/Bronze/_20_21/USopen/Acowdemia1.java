package USACO.Bronze._20_21.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Acowdemia1 {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 18; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/USopen/prob1_bronze_open21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/USopen/prob1_bronze_open21/" + rep + ".out"));
            int n = scanner.nextInt(), l = scanner.nextInt(), count = 0;
            Integer[] papers = new Integer[n];
            for (int i = 0; i < n; i++) papers[i] = scanner.nextInt();
            Arrays.sort(papers, Collections.reverseOrder());
            int h = papers.length;
            while (h > 0 && papers[h - 1] < h) h--;
            if (h != n) for (int j = h; j >= 0 && j > h - l; j--) papers[j]++;
            Arrays.sort(papers, Collections.reverseOrder());
            h = papers.length;
            while (h > 0 && papers[h - 1] < h) h--;
            System.out.println(rep + ": " + h);

            if (h == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
