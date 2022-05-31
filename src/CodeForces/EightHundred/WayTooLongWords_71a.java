package CodeForces.EightHundred;

import java.util.Scanner;

public class WayTooLongWords_71a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n + 1; i++) {
            String word = scanner.nextLine();
            int l = word.length();
            if (l > 10) {
                System.out.println(Character.toString(word.charAt(0)) + (l - 2) + word.charAt(l - 1));
            } else System.out.println(word);
        }
    }
}
