package CodeForces.OneThousand;

import java.util.Scanner;

public class Expression479a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a == 1 || b == 1 || c == 1) {
            if (a == 1) b += 1;
            if (b == 1) {
                if (a < c) a += 1;
                else c += 1;
            }
            if (c == 1) b += 1;
        }
        System.out.println(a * b * c);
    }
}
