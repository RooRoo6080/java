package USACO.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class CowPhotography {
    public static int[] findOrder(int n, int[][] rows) {
        int[] order = new int[n];
        int total = (n * (n + 1)) / 2;
        for (int i = 0; i < n / 2; i++) {
            int sum = 0, num = rows[0][i], diffNum = 0;
            for (int j = 1; j < 5; j++) {
                if (rows[j][i] == num) sum++;
                else diffNum = rows[j][i];
            }
            if (sum > 2) order[i] = sum;
            else order[i] = diffNum;
            total -= order[i];

            int l = n - i - 1;
            sum = 0; num = rows[0][l]; diffNum = 0;
            for (int j = 1; j < 5; j++) {
                if (rows[j][i] == num) sum++;
                else diffNum = rows[j][l];
            }
            if (sum > 2) order[l] = sum;
            else order[l] = diffNum;
            total -= order[l];
        }
        for (int i = 0; i < n; i++) {
            if (order[i] == 0) order[i] = total;
        }
        return order;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] rows = new int[5][n];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                rows[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(findOrder(n, rows)));
    }
}