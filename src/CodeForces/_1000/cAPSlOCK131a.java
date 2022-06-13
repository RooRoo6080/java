package CodeForces._1000;

import java.util.Scanner;

public class cAPSlOCK131a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder s = new StringBuilder();
        if (input.substring(1).toUpperCase().equals(input.substring(1))) {
            for (int i = 0; i < input.length(); i++) {
                char j = input.charAt(i);
                if (j < 91) s.append(Character.toLowerCase(j));
                else s.append(Character.toUpperCase(j));
            }
            System.out.println(s);
        } else System.out.println(input);
    }
}
