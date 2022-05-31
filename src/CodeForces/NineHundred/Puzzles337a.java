package CodeForces.NineHundred;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles337a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] p = new int[scanner.nextInt()];
        for (int i = 0; i < p.length; i++) p[i] = scanner.nextInt();
        Arrays.sort(p);
        int minDiff = Integer.MAX_VALUE;
        for (int i = s - 1; i < p.length; i++) {
            int x = p[i] - p[i - s + 1];
            if (x < minDiff) minDiff = x;
        }
        System.out.println(minDiff);
    }
}