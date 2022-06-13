package CodeForces._1100;

import java.util.Scanner;

public class Taxi158b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] groups = new int[5];
        int taxis = groups[0] = scanner.nextInt();
        for (int i = 0; i < groups[0]; i++) groups[scanner.nextInt()]++;
        int min = Math.min(groups[3], groups[1]);
        taxis -= min;
        groups[1] -= min;
        min = groups[2] / 2;
        taxis -= min;
        groups[2] -= min * 2;
        min = Math.min(groups[2] * 2, groups[1]);
        taxis -= min;
        groups[1] -= min;
        taxis -= groups[1] - ((groups[1] + 3) / 4);
        System.out.println(taxis);
    }
}
