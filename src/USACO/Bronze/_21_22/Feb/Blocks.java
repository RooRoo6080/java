package USACO.Bronze._21_22.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Blocks {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 21; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob3_bronze_feb22/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob3_bronze_feb22/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            String[] cubes = {scanner.next(), scanner.next(), scanner.next(), scanner.next()};
            for (int i = 0; i < n; i++) {
                String w = scanner.next(), ans = "NO";
                for (int a = 0; a < 4; a++) {
                    if (cubes[a].contains(Character.toString(w.charAt(0)))) {
                        if (w.length() == 1) {
                            ans = "YES";
                            break;
                        }
                        for (int b = 0; b < 4; b++) {
                            if (b != a) {
                                if (cubes[b].contains(Character.toString(w.charAt(1)))) {
                                    if (w.length() == 2) {
                                        ans = "YES";
                                        break;
                                    }
                                    for (int c = 0; c < 4; c++) {
                                        if (c != a && c != b) {
                                            if (cubes[c].contains(Character.toString(w.charAt(2)))) {
                                                if (w.length() == 3) {
                                                    ans = "YES";
                                                    break;
                                                }
                                                for (int d = 0; d < 4; d++) {
                                                    if (d != a && d != b && d != c) {
                                                        if (cubes[d].contains(Character.toString(w.charAt(3)))) {
                                                            ans = "YES";
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println(ans);
                if (ans.equals(checkAns.next())) count++;
            }

            if (count == n) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG");
        }
    }
}
