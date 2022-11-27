import java.util.*;
import java.io.*;

public class Main {
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
