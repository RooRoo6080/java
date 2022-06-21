package CodeForces._1200;

import java.util.Scanner;

public class CheapTravel466a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        if (a * m <= b) System.out.println(n * a);
        else System.out.println((n / m * b) + Math.min(n % m * a, b));
    }
}
