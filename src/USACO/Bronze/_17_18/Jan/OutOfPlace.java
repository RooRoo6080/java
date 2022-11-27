package USACO.Bronze._17_18.Jan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class OutOfPlace {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("outofplace.in"));
        FileWriter writer = new FileWriter("outofplace.out");
        int n = scanner.nextInt();
        int[] height = new int[n], sorted = new int[n];
        for (int i = 0; i < n; i++) sorted[i] = height[i] = scanner.nextInt();
        Arrays.sort(sorted);
        int s = -1;
        for (int i = 0; i < n; i++) if (sorted[i] != height[i]) s++;
        s = Math.max(0, s);
        writer.write(String.valueOf(s));
        writer.close();
    }
}
