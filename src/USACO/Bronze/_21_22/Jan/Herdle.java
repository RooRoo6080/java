package USACO.Bronze._21_22.Jan;

import java.io.*;
import java.util.Scanner;

public class Herdle {
    public static void main(String[] args) throws IOException {
        for (int r = 1; r < 12; r++) {
            long startTime = System.currentTimeMillis();
            BufferedReader br = new BufferedReader(new FileReader("src/USACO/Bronze/_21_22/Jan/prob1_bronze_jan22/" + r + ".in"));
            int[] letters = new int[26], board = new int[9];
            int g = 0, y = 0, c = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int a = br.read();
                    letters[a - 65]++;
                    board[c++] = a;
                }
                br.skip(1);
            }
            c = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int a = br.read();
                    if (a == board[c++]) {
                        g++;
                        letters[a - 65]--;
                    } else if (letters[a - 65] > 0) {
                        y++;
                        letters[a - 65]--;
                    }
                }
                br.skip(1);
            }
            System.out.println(r + ": \n" + g + "\n" + y);
            Scanner check = new Scanner(new File("src/USACO/Bronze/_21_22/Jan/prob1_bronze_jan22/" + r + ".out"));
            if (g == check.nextInt() && y == check.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG \n");
        }
    }
}
