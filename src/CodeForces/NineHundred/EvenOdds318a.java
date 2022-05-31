package CodeForces.NineHundred;

import java.util.Scanner;

public class EvenOdds318a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        if (k > (n + 1) / 2) {
            k -= (n + 1) / 2;
            n = 2;
        }
        else n = 1;
        System.out.println(2 * (k - 1) + n);
    }
}
