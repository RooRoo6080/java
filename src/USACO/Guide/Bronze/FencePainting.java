package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FencePainting {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("paint.in"));
        FileWriter writer = new FileWriter("paint.out");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        writer.write(String.valueOf(((b - a) + (d - c)) - Math.max(Math.min(b, d) - Math.max(a, c), 0)));
        writer.close();
    }
}
