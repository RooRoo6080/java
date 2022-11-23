package USACO.Bronze._18_19.USopen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MilkFactory {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("factory.in"));
        FileWriter writer = new FileWriter("factory.out");
        int n = scanner.nextInt();
        int base = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            base -= scanner.nextInt();
            scanner.nextInt();
        }
        writer.write(String.valueOf(base));
        writer.close();
    }
}
