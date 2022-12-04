import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("hoofball.in"));
        FileWriter writer = new FileWriter("hoofball.out");
        int n = scanner.nextInt();
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) cows[i] = scanner.nextInt();
        Arrays.sort(cows);
        int[] intervals = new int[n - 1];
        for (int i = 0; i < n - 2; i++) intervals[i] = cows[i + 1] - cows[i];
        int count = 0;
        for (int i = 1; i < n - 1; i++) if (intervals[i] < intervals[i - 1]) count++;
        writer.write(String.valueOf(count));
        writer.close();
    }
}
