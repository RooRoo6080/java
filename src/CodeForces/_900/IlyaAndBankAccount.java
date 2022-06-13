package CodeForces._900;

import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        if (balance > -1) System.out.println(balance);
        else {
            StringBuilder s = new StringBuilder(String.valueOf(balance));
            int index = s.length() - 1;
            if (s.charAt(s.length() - 2) > s.charAt(s.length() - 1)) index = s.length() - 2;
            System.out.println(Integer.valueOf(String.valueOf(s.deleteCharAt(index))));
        }
    }
}
