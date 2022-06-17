package CodeForces._1100;

import java.util.Scanner;

public class SerejaAndSuffixes368b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), curr = 0;
        int[] arr = new int[n], indexes = new int[n];
        boolean[] used = new boolean[100001];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            if (!used[arr[i]]) curr++;
            used[arr[i]] = true;
            indexes[i] = curr;
        }
        for (int i = 0; i < m; i++) System.out.println(indexes[scanner.nextInt() - 1]);
    }
}
