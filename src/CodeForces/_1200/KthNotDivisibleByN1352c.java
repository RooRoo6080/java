package CodeForces._1200;

import java.util.Scanner;

public class KthNotDivisibleByN1352c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            System.out.println(k + (k - 1) / (n - 1));
        }
    }
}
