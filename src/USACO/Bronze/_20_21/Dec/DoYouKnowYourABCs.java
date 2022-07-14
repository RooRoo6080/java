package USACO.Bronze._20_21.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DoYouKnowYourABCs {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Dec/prob1_bronze_dec20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Dec/prob1_bronze_dec20/" + rep + ".out"));
            int[] numbers = new int[7];
            for (int i = 0; i < 7; i++) numbers[i] = scanner.nextInt();
            Arrays.sort(numbers);
            String s = numbers[0] + " " + numbers[1] + " " + (numbers[6] - numbers[0] - numbers[1]);
            System.out.println(s);

            if (s.equals(checkAns.nextLine())) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
