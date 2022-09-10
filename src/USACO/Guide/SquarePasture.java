package USACO.Guide;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SquarePasture {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println((int) Math.pow(Math.max(a[3] - a[0], b[3] - b[0]), 2));
    }
}

