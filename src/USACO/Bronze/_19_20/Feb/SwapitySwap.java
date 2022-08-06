package USACO.Bronze._19_20.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwapitySwap {
    public static void swap(int[] arr, int a, int b) {
        a--; b--;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 14; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/swap_bronze_feb20/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Feb/swap_bronze_feb20/" + rep + ".out"));
            int n = scanner.nextInt(), k = scanner.nextInt(), count = 0;
            int[] cows = new int[n];
            for (int i = 0; i < n; i++) cows[i] = i + 1;
            ArrayList<int[]> sequences = new ArrayList<>();
            int a1 = scanner.nextInt(), a2 = scanner.nextInt();
            int b1 = scanner.nextInt(), b2 = scanner.nextInt();
            for (int i = 1; i <= k; i++) {
                swap(cows, a1, a2);
                swap(cows, b1, b2);
                if (sequences.contains(cows)) {
                    System.out.println(Arrays.toString(cows));
                    for (int j = 0; j < k % i; j++) {
                        swap(cows, a1, a2);
                        swap(cows, b1, b2);
                    }
                    break;
                }
                sequences.add(cows);
            }
            for (int i : cows) {
                System.out.println(i);
                if (i == checkAns.nextInt()) count++;
            }

            if (count == n) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(c + "/" + 13);
    }
}
