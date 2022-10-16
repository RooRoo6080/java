package CodeForces._1500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Orray1742g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), last = -1;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
            Arrays.sort(a);
            int[] b = new int[n];
            ArrayList<Integer> extra = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (a[i] != last) b[i] = a[i];
                else {
                    extra.add(a[i]);
                }
                last = a[i];
            }
            for (int i = n - extra.size(); i < extra.size(); i++) {
                b[i] = extra.remove(0);
            }
            System.out.println();
            for (int i : b) System.out.print(i + " ");
        }
    }
}
