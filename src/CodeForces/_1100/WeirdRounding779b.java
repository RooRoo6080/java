package CodeForces._1100;

import java.util.Scanner;

public class WeirdRounding779b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int k = scanner.nextInt(), z = 0, d = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (z == k) break;
            if (n.charAt(i) == '0') z++;
            else d++;
        }
        if (z != k) d = n.length() - 1;
        System.out.println(d);
    }
}
