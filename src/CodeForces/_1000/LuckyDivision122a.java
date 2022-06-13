package CodeForces._1000;

import java.util.Scanner;

public class LuckyDivision122a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lucky = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477};
        int n = scanner.nextInt();
        String output = "NO";
        for (int i : lucky) {
            if (n % i == 0) {
                output = "YES";
                break;
            }
        }
        System.out.println(output);
    }
}
