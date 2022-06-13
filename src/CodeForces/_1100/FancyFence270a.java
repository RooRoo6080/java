package CodeForces._1100;

import java.util.Scanner;

public class FancyFence270a {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            } else{
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] angles = new int[22];
        int count = 0;
        for (int i = 3; i <= 360; i++) {
            if (((i - 2.0) * 180.0 / i) % 1 == 0) angles[count++] = (int)((i - 2.0) * 180.0 / i);
        }
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (search(angles, scanner.nextInt()) == -1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
