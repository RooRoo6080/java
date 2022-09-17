package USACO;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("paint.in"));
        FileWriter writer = new FileWriter("paint.out");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        writer.write(String.valueOf(((b - a) + (d - c)) - Math.max(Math.min(b, d) - Math.max(a, c), 0)));
        writer.close();
    }
}
