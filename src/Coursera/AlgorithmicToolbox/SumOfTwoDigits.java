package Coursera.AlgorithmicToolbox;

import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
    }
}