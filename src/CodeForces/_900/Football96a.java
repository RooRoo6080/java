package CodeForces._900;

import java.util.Scanner;

public class Football96a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.contains("1111111") || s.contains("0000000")) System.out.println("YES");
        else System.out.println("NO");
    }
}
