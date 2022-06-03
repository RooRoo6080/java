package CodeForces.OneThousand;

import java.util.Scanner;

public class TheatreSquare1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(), m = scanner.nextLong(), a = scanner.nextLong();
        System.out.println(((n + a - 1) / a) * ((m + a - 1) / a));
    }
}