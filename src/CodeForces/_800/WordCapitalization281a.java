package CodeForces._800;

import java.util.Scanner;
import java.lang.Character;

public class WordCapitalization281a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}
