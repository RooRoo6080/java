package CodeForces._800;

import java.util.Scanner;

public class Watermelon_4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w > 2 && w % 2 == 0) System.out.print("YES");
        else System.out.print("NO");
    }
}