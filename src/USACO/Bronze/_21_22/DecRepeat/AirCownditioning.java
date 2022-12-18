package USACO.Bronze._21_22.DecRepeat;

import java.util.Scanner;

public class AirCownditioning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) p[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) t[i] = scanner.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) d[i] = p[i] - t[i];
        for (int i = 0; i < n; i++) {
            
        }
    }
}

// 5 2 6 1 5