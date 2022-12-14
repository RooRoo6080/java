package USACO.Bronze._17_18.USopen;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TeamTicTacToe {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(new File("test.in"));
        Scanner scanner = new Scanner(System.in);
        //FileWriter writer = new FileWriter("test.out");
        char[] board = new char[9];
        for (int i = 0; i < 9; i++) {
            String s = scanner.next();
            board[i++] = s.charAt(0);
            board[i++] = s.charAt(1);
            board[i] = s.charAt(2);
        }
        int ic = 0, tct = 0;
        int[][] wtw = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 6, 8}, {0, 4, 8}, {2, 4, 6}};
        for (int[] i : wtw) {
            Set<Character> used = new HashSet<>();
            for (int j : i) used.add(board[j]);
            if (used.size() == 1) ic++;
            if (used.size() == 2) tct++;
        }
        System.out.println(ic + "\n" + tct);

        //writer.write(String.valueOf(1));
        //writer.close();
    }
}
