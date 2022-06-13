package CodeForces._800;

import java.util.Scanner;

public class NextRound_158a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt() - 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        int index = array[k];
        k = 0;
        for (int i : array) {
            if (i > 0 && i >= index) k++;
        }
        System.out.println(k);
    }
}
