package USACO.Contest.Dec2022;

import java.util.Arrays;
import java.util.Scanner;

public class CowCollege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) c[i] = scanner.nextInt();
        Arrays.sort(c);
        //System.out.println(Arrays.toString(c));
        long m = 0, t = 0;
        for (int i = n - 1; i >= 0; i--) {
            //System.out.println(i);
            long temp = (long) c[i] * (n - i);
            if (temp >= m) {
                m = temp;
                t = c[i];
            }
            //System.out.println(temp);
        }
        System.out.println(m + " " + t);
    }
}
