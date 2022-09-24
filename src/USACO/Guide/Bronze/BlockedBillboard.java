package USACO.Guide.Bronze;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BlockedBillboard {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("billboard.in"));
        FileWriter writer = new FileWriter("billboard.out");
        int ans = 0;
        boolean[][] view = new boolean[2001][2001];
        for (int i = 0; i < 2; i++) {
            int x1 = scanner.nextInt() + 1000;
            int y1 = scanner.nextInt() + 1000;
            int x2 = scanner.nextInt() + 1000;
            int y2 = scanner.nextInt() + 1000;
            for (int k = x1; k < x2; k++)
                for (int l = y1; l < y2; l++)
                    view[k][l] = true;
        }
        int x1 = scanner.nextInt() + 1000;
        int y1 = scanner.nextInt() + 1000;
        int x2 = scanner.nextInt() + 1000;
        int y2 = scanner.nextInt() + 1000;
        for (int i = x1; i < x2; i++)
            for (int j = y1; j < y2; j++)
                view[i][j] = false;

        for (int i = 0; i <= 2000; i++)
            for (int j = 0; j < 2000; j++)
                if (view[i][j])
                    ans++;

        writer.write(String.valueOf(ans));
        writer.close();
    }
}
