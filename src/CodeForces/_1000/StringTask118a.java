package CodeForces._1000;

import java.util.Scanner;

public class StringTask118a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder newString = new StringBuilder();
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if ("AEIOUYaeiouy".indexOf(s.charAt(i)) == -1) newString.append(".").append(s.charAt(i));
        }
        System.out.println(newString.toString().toLowerCase());
    }
}
