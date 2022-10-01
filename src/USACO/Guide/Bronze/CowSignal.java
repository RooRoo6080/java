package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CowSignal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("cowsignal.in"));
        FileWriter writer = new FileWriter("cowsignal.out");
        int m = scanner.nextInt(), n = scanner.nextInt(), k = scanner.nextInt();
        String[] symbol = new String[m];
        for (int i = 0; i < symbol.length; i++) symbol[i] = scanner.next();
        for (int i = 0; i < m; i++) {
            for (int l = 0; l < k; l++) {
                for (int j = 0; j < n; j++) {
                    for (int x = 0; x < k; x++)
                        writer.write(symbol[i].charAt(j));
                }
                writer.write("\n");
            }
        }
        writer.close();
    }
}
