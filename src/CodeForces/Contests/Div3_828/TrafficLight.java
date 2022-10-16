package CodeForces.Contests.Div3_828;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String c = scanner.next();
            String s = scanner.next();
            s += s;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int curr = 0;
                if (!String.valueOf(s.charAt(i)).equals(c)) continue;
                while (s.charAt(i) != 'g') {
                    curr++;
                    i++;
                }
                if (curr > max) max = curr;
            }
            System.out.println(max);
        }
    }
}
