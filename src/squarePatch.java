import java.util.Arrays;
import java.util.Scanner;

public class squarePatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] output = new int[input];
        for (int i = 0; i < input; i++) {
            output[i] = input;
        }
        for (int i = 0; i < input; i++) {
            System.out.println(Arrays.toString(output));
        }
    }
}
