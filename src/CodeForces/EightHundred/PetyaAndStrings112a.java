package CodeForces.EightHundred;

import java.util.Scanner;

public class PetyaAndStrings112a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.next().toLowerCase().toCharArray();
        char[] b = scanner.next().toLowerCase().toCharArray();
        boolean printed = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                System.out.println(1);
                printed = true;
                break;
            } else if (b[i] > a[i]) {
                System.out.println(-1);
                printed = true;
                break;
            }
        }
        if (!printed) System.out.println(0);
    }
}
