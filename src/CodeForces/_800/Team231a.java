package CodeForces._800;

import java.util.Scanner;

public class Team231a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() + scanner.nextInt() + scanner.nextInt() > 1) count++;
        }
        System.out.println(count);
    }
}
