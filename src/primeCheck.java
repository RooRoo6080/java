import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i <= input/2; i++) {
            if (input % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }
}
