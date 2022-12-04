package USACO.Bronze._17_18.Feb;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hoofball {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(new File("test.in"));
        Scanner scanner = new Scanner(System.in);
        //FileWriter writer = new FileWriter("test.out");
        int n = scanner.nextInt();
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) cows[i] = scanner.nextInt();
        Arrays.sort(cows);
        int[] intervals = new int[n - 1];
        for (int i = 0; i < n - 2; i++) intervals[i] = cows[i + 1] - cows[i];
        int count = 0;
        for (int i = 1; i < n - 1; i++) if (intervals[i] < intervals[i - 1]) count++;
        System.out.println(count);

        //writer.write(String.valueOf(1));
        //writer.close();
    }
}
