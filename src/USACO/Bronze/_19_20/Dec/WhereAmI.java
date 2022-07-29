package USACO.Bronze._19_20.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WhereAmI {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Dec/whereami_bronze_dec19/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Dec/whereami_bronze_dec19/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            String s = scanner.next();
            for (int i = 1; i <= n; i++) {
                ArrayList<String> patterns = new ArrayList<>();
                StringBuilder curr = new StringBuilder();
                boolean unique = true;
                for (int j = 0; j < i; j++) curr.append(s.charAt(j));
                patterns.add(curr.toString());
                for (int j = i; j < n; j++) {
                    curr.deleteCharAt(0);
                    curr.append(s.charAt(j));
                    if (patterns.contains(curr.toString())) {
                        unique = false;
                        break;
                    }
                    patterns.add(curr.toString());
                }
                if (unique) {
                    count = i;
                    break;
                }
            }

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
