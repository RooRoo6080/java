package USACO.Bronze._20_21.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaisyChains {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Dec/prob2_bronze_dec20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Dec/prob2_bronze_dec20/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            ArrayList<Double> daisies = new ArrayList<>();
            for (int i = 0; i < n; i++) daisies.add(scanner.nextDouble());
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    double average = 0;
                    for (double k : daisies.subList(i, j + 1)) average += k;
                    average /= (j - i + 1);
                    if (daisies.subList(i, j + 1).contains(average)) count++;
                }
            }
            System.out.println(count);

            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
