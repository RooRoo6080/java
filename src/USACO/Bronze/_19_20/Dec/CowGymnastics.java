package USACO.Bronze._19_20.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CowGymnastics {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Dec/gymnastics_bronze_dec19/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Dec/gymnastics_bronze_dec19/" + rep + ".out"));
            int k = scanner.nextInt(), n = scanner.nextInt(), count = 0;
            HashMap<Integer, ArrayList<Integer>> relation = new HashMap<>();
            int[] order = new int[n];
            for (int i = 0; i < n; i++) order[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> after = new ArrayList<>();
                for (int j = i + 1; j < n; j++) after.add(order[j]);
                relation.put(order[i], after);
            }
            for (int i = 0; i < k - 1; i++) {
                ArrayList<Integer> ranks = new ArrayList<>();
                for (int j = 0; j < n; j++) ranks.add(scanner.nextInt());
                for (int j = 1; j <= n; j++) {
                    for (int l = 0; l < relation.get(j).size(); l++) {
                        if (ranks.indexOf(relation.get(j).get(l)) < ranks.indexOf(j)) {
                            relation.get(j).remove(relation.get(j).get(l));
                            l--;
                        }
                    }
                }
            }
            for (int i = 1; i <= n; i++) count += relation.get(i).size();

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
