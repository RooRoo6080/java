package Coursera.AlgorithmicToolbox;

import java.util.Scanner;

public class MaximumPairwiseProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(arr[0]), num2 = Integer.parseInt(arr[1]), ind1 = 0, ind2 = 1;
        if (length > 2) {
            for (int i = 2; i < length; i++) {
                int num = Integer.parseInt(arr[i]);
                if (num > num1 && i != ind2) {
                    num1 = num;
                    ind1 = i;
                }
                else if (num > num2 && i != ind1) {
                    num2 = num;
                    ind2 = i;
                }
            }
        }
        System.out.println((long)num1 * num2);
    }
}
