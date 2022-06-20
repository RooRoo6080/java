package CodeForces._1100;

import java.util.Scanner;

public class FedorAndNewGame467b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt(), count = -1;
        int[] a = new int[m + 1];
        for (int i = 0; i < m + 1; i++) a[i] = scanner.nextInt();
        for (int i : a) if (Integer.bitCount(i ^ a[m])  <= k) count++;
        System.out.println(count);
    }
}
