import java.util.Scanner;

public class phoneNumberWordDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] x = input.split("");
        String[] array = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int count = 2;
        for (String i : array) {
            for (String j : x) {
                if (i.contains(j)) {
                    input = input.replaceAll(j, String.valueOf(count));
                }
            }
            count++;
        }
        System.out.println(input);
    }
}
