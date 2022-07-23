package USACO.Bronze._20_21.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClockwiseFence {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob3_bronze_feb21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob3_bronze_feb21/" + rep + ".out"));
            int n = scanner.nextInt(), c = 0;
            for (int i = 0; i < n; i++) {
                String ans = "CW";
                int deg = 0;
                String s = scanner.next();
                s += s.charAt(0);
                for (int j = 1; j < s.length(); j++) {
                    if ("NE.ES.SW.WN".contains(s.substring(j - 1, j + 1))) deg--;
                    else if ("NW.WS.SE.EN".contains(s.substring(j - 1, j + 1))) deg++;
                }
                if (deg == 4) ans = "CCW";
                System.out.println(ans);
                if (ans.equals(checkAns.next())) c++;
            }
            if (c == n) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms\n");
            else System.out.println("WRONG\n");
        }
    }
}
