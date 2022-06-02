package CodeForces.EightHundred;

import java.util.Scanner;

public class Bitpp282a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = 0;
        String s;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            s = scanner.next();
            if (s.contains("-")) var--;
            else if (s.contains("+")) var++;
        }
        System.out.println(var);
    }
}
