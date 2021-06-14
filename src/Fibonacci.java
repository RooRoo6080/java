import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        extracted();
    }

    public static void extracted() {
        Scanner scanner = new Scanner(System.in);
        long x = 0;
        long y = 1;
        long output = 1;
        System.out.print("Enter a number:");
        long number = scanner.nextLong();
        System.out.println(0);
        while (output <= number) {
            System.out.println(output);
            output = x + y;
            x = y;
            y = output;
        }
    }
}
