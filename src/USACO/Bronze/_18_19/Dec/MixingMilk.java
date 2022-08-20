package USACO.Bronze._18_19.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MixingMilk {

    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 11; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Dec/mixmilk_bronze_dec18/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int count = 0;
            int[] capacity = new int[3];
            int[] milk = new int[3];
            for (int i = 0; i < 3; i++) {
                capacity[i] = scanner.nextInt();
                milk[i] = scanner.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                int a = i % 3;
                int b = (i + 1) % 3;
                int transfer = Math.min(milk[a], capacity[b] - milk[b]);
                milk[a] -= transfer;
                milk[b] += transfer;
            }
            for (int i : milk) {
                if (i == checkAns.nextInt()) count++;
                System.out.print(i + " ");
            }

            if (count == 3) {
                System.out.println("\nCORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("\nWRONG\n");
        }
        System.out.println(c + "/" + 10);
    }
}
