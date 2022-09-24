import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("mixmilk.in"));
        FileWriter writer = new FileWriter("mixmilk.out");
        int[] capacity = new int[3];
        int[] milk = new int[3];
        for (int i = 0; i < 3; i++) {
            capacity[i] = scanner.nextInt();
            milk[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            int a = i % 3;
            int b = (i + 1) % 3;
            int transfer = Math.min(milk[a], capacity[b] - milk[b]);
            milk[a] -= transfer;
            milk[b] += transfer;
        }
        for (int i : milk) writer.write(i + "\n");
        writer.close();
    }
}
