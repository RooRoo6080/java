package USACO.Guide.Bronze;

import java.util.Scanner;

public class FencePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        System.out.println(((b - a) + (d - c)) - Math.max(Math.min(b, d) - Math.max(a, c), 0));
    }
}
