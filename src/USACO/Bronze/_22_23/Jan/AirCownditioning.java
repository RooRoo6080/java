package USACO.Bronze._22_23.Jan;

import java.util.Arrays;
import java.util.Scanner;

public class AirCownditioning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] cows = new int[100];
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt(), end = scanner.nextInt(), cool = scanner.nextInt();
            for (int j = start; j <= end; j++) cows[j] = cool;
        }
        int[][] conditioners = new int[m][4];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 4; j++) {
                conditioners[i][j] = scanner.nextInt();
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int mask = 0; mask < 1 << m; mask++) {
            int[] numberLine = new int[101];
            int totalCost = 0;
            for (int j = 0; j < m; j++) {
                if ((mask & (1 << j)) != 0) {
                    totalCost += conditioners[j][3];
                    for (int i = conditioners[j][0]; i <= conditioners[j][1]; i++) {
                        numberLine[i] += conditioners[j][2];
                    }
                }
            }
            boolean works = true;
            for (int j = 0; j < n; j++) {
                for (int i = cows[0]; i <= cows[1]; i++) {
                    if (numberLine[i] < cows[2]) {
                        works = false;
                        break;
                    }
                }
            }
            if (works) {
                answer = Math.min(answer, totalCost);
            }
        }
        System.out.println(answer);
    }
}
