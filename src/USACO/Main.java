import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("factory.in"));
        FileWriter writer = new FileWriter("factory.out");
        int n = scanner.nextInt();
        int base = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            base -= scanner.nextInt();
            scanner.nextInt();
        }
        writer.write(String.valueOf(base));
        writer.close();
    }
}
