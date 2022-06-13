package CodeForces._1000;

import java.util.Scanner;

public class NewYearTransportation500a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() - 1;
        int t = scanner.nextInt();
        int[] c = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) c[i] = scanner.nextInt();
        while(p < t - 1) p += c[p];
        if(p == t - 1) System.out.println("YES");
        else System.out.println("NO");;
    }
}
