package USACO.Bronze._20_21.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AcowdemiaII {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/USopen/prob2_bronze_open21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/USopen/prob2_bronze_open21/" + rep + ".out"));
            int k = scanner.nextInt(), n = scanner.nextInt(), count = 0;
            HashMap<String, Integer> members = new HashMap<>();
            for (int i = 0; i < n; i++) members.put(scanner.next(), i);
            char[][] output = new char[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(output[i], '?');
                output[i][i] = 'B';
            }
            for (int i = 0; i < k; i++) {
                String[] authorList = new String[n];
                for (int j = 0; j < n; j++) authorList[j] = scanner.next();
                for (int j = 0; j < n; j++) {
                    boolean alphabetical = true;
                    for (int l = j + 1; l < n; l++) {
                        if (authorList[l - 1].compareTo(authorList[l]) > 0) alphabetical = false;
                        if (!alphabetical) {
                            int a = members.get(authorList[j]);
                            int b = members.get(authorList[l]);
                            output[a][b] = '0';
                            output[b][a] = '1';
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                StringBuilder out = new StringBuilder();
                for (int j = 0; j < n; j++) out.append(output[i][j]);
                if (out.toString().equals(checkAns.next())) count++;
                System.out.println(out);
            }

            if (count == n) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
