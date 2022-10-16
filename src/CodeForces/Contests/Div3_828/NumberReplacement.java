package CodeForces.Contests.Div3_828;

import java.util.Objects;
import java.util.Scanner;

public class NumberReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            String s = scanner.next();
            String[] assignments = new String[51];
            boolean yes = true;
            for (int i = 0; i < n; i++) {
                if (assignments[a[i]] != null && !Objects.equals(assignments[a[i]], String.valueOf(s.charAt(i)))) {
                    yes = false;
                    System.out.println("NO");
                    break;
                }
                assignments[a[i]] = String.valueOf(s.charAt(i));
            }
            if (yes) System.out.println("YES");
        }
    }
}
