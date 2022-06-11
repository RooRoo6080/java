package CodeForces.ThousandHundred;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink706b {
    public static int search(int[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left++ + right) / 2;
        if (arr.length == 1) {
            if (target < arr[0]) return 0;
            else return 1;
        }
        while (left <= right) {
            if (arr[mid] < target) {
                left = mid + 1;
                if (left > right && arr[(left + right) / 2] < target) return arr.length;
            } else if (arr[mid] > target && arr[mid - 1] <= target)  return mid;
            else if (arr[mid] == target || (arr[mid] > target && mid == arr.length - 1)) {
                return search(arr, target + 0.5);
            } else right = mid - 1;
            mid = (left + right) / 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[scanner.nextInt()];
        for (int i = 0; i < prices.length; i++) prices[i] = scanner.nextInt();
        Arrays.sort(prices);
        int days = scanner.nextInt();
        for (int i = 0; i < days; i++) {
            long m = scanner.nextLong();
            if (m >= 100000) System.out.println(prices.length);
            else System.out.println(search(prices, (double) m));
        }
    }
}