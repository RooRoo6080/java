package CodeForces._900;

import java.util.Scanner;

public class GameWithSticks451a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (Math.min(scanner.nextInt(), scanner.nextInt()) % 2 == 0) System.out.println("Malvika");
        else System.out.println("Akshat");
    }
}