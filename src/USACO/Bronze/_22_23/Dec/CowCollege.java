package USACO.Bronze._22_23.Dec;

import java.util.Arrays;
import java.util.Scanner;

public class CowCollege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        int max = 0, price = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] * (n - i) > max) {
                max = arr[i] * (n - i);
                price = arr[i];
            }
        }
        System.out.println(max + " " + price);
    }
}
