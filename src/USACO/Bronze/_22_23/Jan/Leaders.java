package USACO.Bronze._22_23.Jan;

import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int g = -1, h = -1;
        int lastg = 0, lasth = 0;
        for (int i = n - 1; i >= 0; i--) if (s.charAt(i) == 'G') lastg = i;
        for (int i = n - 1; i >= 0; i--) if (s.charAt(i) == 'H') lasth = i;
        for (int i = 0; i < n; i++) if (s.charAt(i) == 'G' && arr[i] > lastg) g = i;
        for (int i = 0; i < n; i++) if (s.charAt(i) == 'H' && arr[i] > lasth) h = i;
        System.out.println(lastg + " " + lasth);
        System.out.println(g + " " + h);
    }
}
