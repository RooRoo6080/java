package CodeForces._1100;

import java.util.Scanner;

public class IlyaAndQueries313b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] indexes = new int[s.length()];
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) count++;
            indexes[i] = count;
        }
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            System.out.println(indexes[b - 1] - indexes[a - 1]);
        }
    }
}
