package USACO.Bronze._20_21.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UdderedButNotHerd {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Jan/prob1_bronze_jan21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Jan/prob1_bronze_jan21/" + rep + ".out"));
            String cowphabet = scanner.next(), word = scanner.next();
            int count = 0, lastIndex = cowphabet.length();
            for (int i = 0; i < word.length(); i++) {
                int index = cowphabet.indexOf(word.charAt(i));
                if (index <= lastIndex) count++;
                lastIndex = index;
            }
            System.out.println(count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
