package USACO.Bronze._19_20.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            System.out.println(rep + ": ");
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Jan/word_bronze_jan20/" + rep + ".in"));
            int n = scanner.nextInt(), k = scanner.nextInt();
            String s = scanner.next();
            int count = s.length();
            System.out.print(s);
            for (int i = 1; i < n; i++) {
                s = scanner.next();
                count += s.length();
                if (count > k) {
                    System.out.print("\n" + s);
                    count = s.length();
                } else System.out.print(" " + s);
            }
            System.out.println("\n");
        }
    }
}
