package CodeForces._800;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.next().split("");
        Arrays.sort(s);
        System.out.println(String.join("+", s).substring(s.length / 2 * 2));
    }
}
