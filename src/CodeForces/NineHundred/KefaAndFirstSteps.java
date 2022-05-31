package CodeForces.NineHundred;

import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 1;
        int currMax = 1;
        int last = scanner.nextInt();
        int curr;
        for (int i = 1; i < n; i++) {
            curr = scanner.nextInt();
            if (curr >= last) {
                currMax++;
                if (currMax > max) max = currMax;
            } else currMax = 1;
            last = curr;
        }
        System.out.println(max);
    }
}
