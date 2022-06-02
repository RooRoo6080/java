package CodeForces.EightHundred;

import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix263a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 1, n = 0;
        for (int i = 0; i < 25; i++) {
            n++;
           if (n > 5) {
               m++;
               n = 1;
           }
           if (scanner.nextInt() == 1) break;
        }
        System.out.println(Math.abs(m - 3) + Math.abs(n - 3));
    }
}
