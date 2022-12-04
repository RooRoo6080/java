package USACO.Bronze._17_18.Feb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teleportation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("teleport.in"));
        FileWriter writer = new FileWriter("teleport.out");
        int a = scanner.nextInt(), b = scanner.nextInt(), x = scanner.nextInt(), y = scanner.nextInt();
        writer.write(String.valueOf(Math.min(Math.abs(a - b), Math.abs(Math.min(a, b) -
                Math.min(x, y)) + Math.abs(Math.max(a, b) - Math.max(x, y)))));
        writer.close();
    }
}
