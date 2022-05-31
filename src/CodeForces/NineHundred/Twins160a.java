package CodeForces.NineHundred;

import java.util.Arrays;
import java.util.Scanner;

public class Twins160a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int total = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            total += coins[i] = scanner.nextInt();
        }
        Arrays.sort(coins);
        for (int i = n - 1; i >= 0; i--) {
            count++;
            sum += coins[i];
            if (sum > total - sum) break;
        }
        System.out.println(count);
    }
}
