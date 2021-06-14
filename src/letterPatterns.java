import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class letterPatterns {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);
        System.out.print("Enter your first pattern:");
        String one = scammer.next();
        System.out.print("Enter your second pattern:");
        String two = scammer.next();

        Set<Character> one_set = new LinkedHashSet<>();
        for (int i = 0; i < one.length(); i++) {
            one_set.add(one.charAt(i));
        }
        Set<Character> two_set = new LinkedHashSet<>();
        for (int i = 0; i < two.length(); i++) {
            two_set.add(two.charAt(i));
        }

        int count = 0;
        for (Character i : one_set) {
            one = one.replaceAll(Character.toString(i), String.valueOf(count));
            count++;
        }
        count = 0;
        for (Character i : two_set) {
            two = two.replaceAll(Character.toString(i), String.valueOf(count));
            count++;
        }
        if (one.equals(two)) {
            System.out.println("\nSame pattern \n");
        }
        else {
            System.out.println("\nDifferent patterns \n");
        }
        System.out.println(one);
        System.out.println(two);
    }
}
