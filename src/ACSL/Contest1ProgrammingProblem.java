package ACSL;

import java.util.Scanner;

public class Contest1ProgrammingProblem {
    public static void process(String s, String n, int d) {
        System.out.print("\n" + d + ". ");
        String[] digits = s.split("");
        int p = digits.length - Integer.parseInt(n);
        int valueP = Integer.parseInt(digits[p]);
        for (int i = 0; i < p; i++) { System.out.print((Integer.parseInt(digits[i]) + valueP) % 10); }
        System.out.print(valueP);
        for (int i = p + 1; i < digits.length; i++) { System.out.print(java.lang.Math.abs(Integer.parseInt(digits[i]) - valueP)); }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            process(scanner.next(), scanner.next(), i);
        }
    }
}
