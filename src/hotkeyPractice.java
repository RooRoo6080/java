import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class hotkeyPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input = scanner.next();
        extracted(scanner, random, input);
    }

    private static void extracted(Scanner scanner, Random random, String input) {
        Map<String, String> hotkeys = Map.ofEntries(
                Map.entry("1", "q"),
                Map.entry("2", "2"),
                Map.entry("3", "3"),
                Map.entry("4", "4"),
                Map.entry("5", "r"),
                Map.entry("6", "f"),
                Map.entry("7", "c"),
                Map.entry("8", "x"),
                Map.entry("9", "1")
        );
        while (!input.equals("quit")) {
            int r = random.nextInt(9) + 1;
            System.out.println("\n" + r);
            long start = System.currentTimeMillis();
            input = scanner.next();
            long end = System.currentTimeMillis();
            if (input.equals(hotkeys.get(String.valueOf(r)))) {
                System.out.println((end - start) / 1000F + " seconds");
            } else {
                System.out.println("--BAD--");
            }
        }
    }
}
