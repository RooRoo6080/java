package CodeForces._1000;

import java.util.Scanner;

public class XeniaAndRingroad339b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long homes = scanner.nextInt();
        long tasks = scanner.nextInt();
        long curr = 1;
        long time = 0;
        for (int i = 0; i < tasks; i++) {
            long next = scanner.nextInt();
            if (curr <= next) time += next - curr;
            else time += homes - curr + next;
            curr = next;
        }
        System.out.println(time);
    }
}
