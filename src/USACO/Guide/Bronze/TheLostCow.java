package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheLostCow {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("lostcow.in"));
        FileWriter writer = new FileWriter("lostcow.out");
        int x = scanner.nextInt(), y = scanner.nextInt();
        int ans = 0;
        boolean direction = true;
        int increment = 1;
        while (true) {
            if (direction && x < y && y <= x + increment || !direction && y >= x - increment && y <= x) {
                ans += Math.abs(y - x);
                break;
            } else {
                increment *= 2;
                ans += increment;
                direction = !direction;
            }
        }

        writer.write(String.valueOf(ans));
        writer.close();
    }
}
