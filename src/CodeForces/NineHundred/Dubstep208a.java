package CodeForces.NineHundred;

import java.util.Scanner;

public class Dubstep208a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dub = scanner.next();
        StringBuilder wording = new StringBuilder();
        for (int i = 0; i < dub.length(); i++) {
            if (dub.startsWith("WUB", i)) {
                i += 2;
                wording.append(" ");
            } else wording.append(dub.charAt(i));
        }
        System.out.println(wording.toString().replaceAll("\\s+", " ").trim());
    }
}
