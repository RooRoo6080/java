import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class wordJumbler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        System.out.print("text:");
        String text = scanner.nextLine();
        String[] split = text.split(" ");
        for (String i : split) {
            String[] j = i.split("");
            try {
                i = i.substring(1, i.length() - 1);
                String[] iList = i.split("");
                Collections.shuffle(Arrays.asList(iList));
                StringBuilder str = new StringBuilder();
                for (String s : iList) {
                    str.append(s);
                }
                String append = j[0] + str + j[j.length - 1];
                output.append(append).append(" ");
            }
            catch (Exception e) {
                output.append(i).append(" ");
            }
        }
        System.out.println(output);
    }
}
