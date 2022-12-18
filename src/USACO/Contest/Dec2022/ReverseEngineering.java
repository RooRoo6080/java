package USACO.Contest.Dec2022;

import java.util.Scanner;

public class ReverseEngineering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            //scanner.next();
            int n = scanner.nextInt(), m = scanner.nextInt();
            boolean lie = false;
            for (int j = 0; j < m; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                //System.out.println(a + " " + b);
                if ((a > 0 && b != 1) || a == 0 && b == 1) {
                    lie = true;
                }
            }
            if (lie) System.out.println("LIE");
            else System.out.println("OK");
        }
    }
}
