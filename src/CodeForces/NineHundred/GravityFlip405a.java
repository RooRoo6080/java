package CodeForces.NineHundred;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip405a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] toys = new int[scanner.nextInt()];
        for (int i = 0; i < toys.length; i++) {
            toys[i] = scanner.nextInt();
        }
        Arrays.sort(toys);
        for (int i : toys) System.out.print(i + " ");
    }
}