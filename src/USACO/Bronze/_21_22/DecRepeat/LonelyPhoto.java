package USACO.Bronze._21_22.DecRepeat;

import java.util.Scanner;

public class LonelyPhoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 3; j <= n; j++) {
                String sub = s.substring(i, j);
                int h = 0, g = 0;
                for (char l : sub.toCharArray()) {
                    if (l == 'G') g++;
                    else h++;
                }
                if (h >= 2 && g >= 2) break;
                if (h == 1 || g == 1) c++;
            }
        }
        System.out.println(c);
    }
}
