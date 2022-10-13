package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BovineShuffle {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("shuffle.in"));
        FileWriter writer = new FileWriter("shuffle.out");
        int n = scanner.nextInt();
        int[] shuffle = new int[n + 1]; 
        for (int i = 1; i <= n; i++) shuffle[scanner.nextInt()] = i;
        int[] curr = new int[n + 1];
        for (int i = 1; i <= n; i++) curr[i] = scanner.nextInt();
        int[] orig = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int c = i;
            for(int j = 1; j <= 3; j++) c = shuffle[c];
            orig[c] = curr[i];
        }
        for (int i = 1; i < orig.length; i++) writer.write(orig[i] + "\n");
        writer.close();
    }
}
