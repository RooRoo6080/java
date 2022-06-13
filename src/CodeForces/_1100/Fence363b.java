package CodeForces._1100;

import java.util.Scanner;

public class Fence363b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt(), index = 1;
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) heights[i] = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) sum += heights[i];
        n = sum;
        for (int i = 0; i < heights.length - k;) {
            sum -= heights[i];
            sum += heights[i++ + k];
            if (sum < n) {
                n = sum;
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}
