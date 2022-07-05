package USACO.Bronze._21_22.Jan;

import java.io.*;
import java.util.Scanner;

public class NonTransitiveDice {
    public static boolean check(int[] a, int[] b) {
        int d = 0;
        for (int i : a) {
            for (int j : b) {
                if (i > j) d++;
                else if (i < j) d--;
            }
        }
        return d > 0;
    }

    public static void main(String[] args) throws IOException {
        for (int r = 1; r < 12; r++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Jan/prob2_bronze_jan22/" + r + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/Jan/prob2_bronze_jan22/" + r + ".out"));
            int t = scanner.nextInt(), count = 0;
            System.out.println(r + ": ");
            for (int j = 0; j < t; j++) {
                String ans = "no";
                int[] a = new int[4];
                for (int i = 0; i < 4; i++) a[i] = scanner.nextInt();
                int[] b = new int[4];
                for (int i = 0; i < 4; i++) b[i] = scanner.nextInt();

                for (int s1 = 1; s1 < 11; s1++) {
                    for (int s2 = 1; s2 < 11; s2++) {
                        for (int s3 = 1; s3 < 11; s3++) {
                            for (int s4 = 1; s4 < 11; s4++) {
                                int[] c = {s1, s2, s3, s4};
                                if ((check(a, b) && check(b, c) && check(c, a)) || (check(b, a) && check(a, c) && check(c, b))) ans = "yes";
                            }
                        }
                    }
                }
                System.out.println(ans);
                if (ans.equals(checkAns.next())) count++;
            }
            if (count == t) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
