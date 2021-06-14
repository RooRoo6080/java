import java.util.Scanner;

public class palindrome {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String reverseString = "";
        for (int i=string.length(); i-- > 0;) {
            reverseString += string.charAt(i);
        }
        if (reverseString.equals(string)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
