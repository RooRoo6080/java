import java.util.*;
import java.io.*;

public class Main {
    public static int interArea(int[] s1, int[] s2) {
        return ((s1[3] - s1[1]) * (s1[2] - s1[0]) - ((Math.min(s1[2], s2[2]) - Math.max(s1[0], s2[0]))
                * (Math.min(s1[3], s2[3]) - Math.max(s1[1], s2[1]))));
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("billboard.in"));
        FileWriter writer = new FileWriter("billboard.out");
        int[][] b = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        writer.write(String.valueOf(interArea(b[0], b[2]) + interArea(b[1], b[2])));
        writer.close();
    }
}
