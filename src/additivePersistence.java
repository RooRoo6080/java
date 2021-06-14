import java.util.Scanner;

public class additivePersistence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = 0;
        while (input.length() > 1) {
            int add = 0;
            for (int i = 0; i < input.length(); i++) {
                add = add + Character.getNumericValue(input.charAt(i));
            }
            input = String.valueOf(add);
            System.out.println(input);
            count ++;
        }
        System.out.println("\n-- "+count+" --");
    }
}
