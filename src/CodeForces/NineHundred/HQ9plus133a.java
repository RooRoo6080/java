package CodeForces.NineHundred;

import java.util.Scanner;

public class HQ9plus133a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        if (code.contains("H") || code.contains("Q") || code.contains("9")) System.out.println("YES");
        else System.out.println("NO");
    }
}
