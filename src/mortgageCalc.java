import java.util.Scanner;

public class mortgageCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number:");
        int number = scan.nextInt();
        String output = Integer.toString(number);
        if (number % 15 == 0) {
            output = "FizzBuzz";
        } else if (number % 5 == 0) {
            output = "Fizz";
        } else if (number % 3 == 0) {
            output = "Buzz";
        }
        System.out.println(output);
    }
}
