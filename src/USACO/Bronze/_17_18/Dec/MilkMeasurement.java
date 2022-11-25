package USACO.Bronze._17_18.Dec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MilkMeasurement {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(new File("measurement.in"));
        Scanner scanner = new Scanner(System.in);
        //FileWriter writer = new FileWriter("measurement.out");
        int n = scanner.nextInt(), m = 7, e = 7, b = 7, max = 7, count = 0;
        boolean[] board = new boolean[]{true, true, true};
        String[][] log = new String[n][3];
        for (int i = 0; i < n; i++) log[i] = new String[]{scanner.next(), scanner.next(), scanner.next()};
        Arrays.sort(log, Comparator.comparing(a -> Integer.parseInt(a[0])));
        for (String[] i : log) {
            if (i[1].equals("Mildred")) {
                m += Integer.parseInt(i[2]);
            } else if (i[1].equals("Elsie")) {
                e += Integer.parseInt(i[2]);
            } else {
                b += Integer.parseInt(i[2]);
            }
            boolean[] t = board.clone();
            max = Math.max(m, Math.max(e, b));
            board[0] = m >= max;
            board[1] = e >= max;
            board[2] = b >= max;
            if (!Arrays.equals(t, board)) count++;
        }
        System.out.println(count);
        for (String[] i : log) System.out.println(Arrays.toString(i));
        //writer.write(String.valueOf(count));
        //writer.close();
    }
}
