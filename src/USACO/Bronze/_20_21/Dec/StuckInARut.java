package USACO.Bronze._20_21.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StuckInARut {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Dec/prob3_bronze_dec20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Dec/prob3_bronze_dec20/" + rep + ".out"));
            int t = scanner.nextInt(), count = 0;
            int[] e = new int[t], n = new int[t];
            char[] direction = new char[t];
            for (int j = 0; j < t; j++) {
                direction[j] = scanner.next().charAt(0);
                e[j] = scanner.nextInt();
                n[j] = scanner.nextInt();
            }
            int[] answer = new int[t];
            Arrays.fill(answer, Integer.MAX_VALUE);
            ArrayList<Integer> diff = new ArrayList<>();
            for (int j = 0; j < t; j++) {
                for (int k = j + 1; k < t; k++) {
                    diff.add(Math.abs(e[k] - e[j]));
                    diff.add(Math.abs(n[k] - n[j]));
                }
            }
            Collections.sort(diff);
            for (int i : diff) {
                for (int j = 0; j < t; j++) {
                    for (int k = 0; k < t; k++) {
                        if (direction[j] == 'E' && direction[k] == 'N' && e[j] < e[k] && n[k] < n[j]) {
                            if (e[j] + i == e[k] && n[k] + Math.min(answer[k], i) > n[j]) answer[j] = Math.min(answer[j], i);
                            else if (n[k] + i == n[j] && e[j] + Math.min(answer[j], i) > e[k]) answer[k] = Math.min(answer[k], i);
                        }
                    }
                }
            }
            for (int j : answer) {
                String ans;
                if (j == Integer.MAX_VALUE) ans = "Infinity";
                else ans = String.valueOf(j);
                System.out.println(ans);
                if (ans.equals(checkAns.next())) count++;
            }

            if (count == t) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
