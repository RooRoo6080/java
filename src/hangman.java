import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 6;
        String word = randomWordGen.getWord();
        int doneCheck = 0;
        String[] split = word.split("");
        List<String> underlines = new ArrayList<>();
        for (String ignored : split) {
            underlines.add("_");
        }
        System.out.println(String.join(" ", underlines));
        loops(scanner, count, word, doneCheck, split, underlines, word);
    }

    private static void loops(Scanner scanner, int count, String word, int doneCheck, String[] split, List<String> underlines, String unchanged) {
        while (count > 0) {
            String input = scanner.next();
            if (word.contains(input)) {
                int iterate = 0;
                for (String i : split) {
                    if (i.equals(input)) {
                        underlines.set(iterate, input);
                        doneCheck++;
                    }
                    iterate++;
                }
                if (doneCheck == word.length()) {
                    System.out.println(String.join(" ", underlines));
                    System.out.println("You won!");
                    System.exit(0);
                }
                System.out.println("You guessed right");
                word = word.replace(input, "#");
            } else {
                count--;
                System.out.println("Wrong, " + count + " tries remaining");
            }
            System.out.println(String.join(" ", underlines) + "\n");
        }
        System.out.println("You Lost! The word was " + unchanged);
    }
}
