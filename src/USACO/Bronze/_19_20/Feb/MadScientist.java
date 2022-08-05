package USACO.Bronze._19_20.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MadScientist {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/breedflip_bronze_feb20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/breedflip_bronze_feb20/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            String a = scanner.next(), b = scanner.next();
            boolean last = false;
            for (int i = 0; i < n; i++) {
                if (b.charAt(i) != a.charAt(i) && !last) {
                    last = true;
                    count++;
                } else if (b.charAt(i) == a.charAt(i)) last = false;
            }

            System.out.println(rep + ": " + count);

            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
