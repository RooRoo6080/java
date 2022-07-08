package USACO.Bronze._21_22.Feb;

// working through testcase 10; TLE 11 - 14

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Photoshoot2 {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 15; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob2_bronze_feb22/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob2_bronze_feb22/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(scanner.nextInt());
            for (int i = 0; i < n; i++) b.add(scanner.nextInt());
            while (!a.equals(b)) {
                for (int i = 0; i < n; i++) {
                    if (!Objects.equals(a.get(i), b.get(i))) {
                        a.add(i, a.remove(a.indexOf(b.get(i))));
                        count++;
                        break;
                    }
                }
            }
            System.out.println(rep + ": " + count);

            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG");
        }
    }
}
