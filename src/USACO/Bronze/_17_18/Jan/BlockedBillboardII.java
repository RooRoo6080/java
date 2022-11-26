package USACO.Bronze._17_18.Jan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BlockedBillboardII {
    public static boolean covered(int x, int y, int x1, int y1, int x2, int y2) {
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("billboard.in"));
        FileWriter writer = new FileWriter("billboard.out");
        int[] lb = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] cfb = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int c = 0;
        if (covered(lb[0], lb[1], cfb[0], cfb[1], cfb[2], cfb[3])) c++;
        if (covered(lb[0], lb[3], cfb[0], cfb[1], cfb[2], cfb[3])) c++;
        if (covered(lb[2], lb[1], cfb[0], cfb[1], cfb[2], cfb[3])) c++;
        if (covered(lb[2], lb[3], cfb[0], cfb[1], cfb[2], cfb[3])) c++;
        int i = (lb[2] - lb[0]) * (lb[3] - lb[1]);
        if(c < 2) writer.write(String.valueOf(i));
        else if (c == 4) writer.write(String.valueOf(4));
        else { writer.write(i - (Math.min(lb[2], cfb[2]) - Math.max(lb[0], cfb[0]))
                    * (Math.min(lb[3], cfb[3]) - Math.max(lb[1], cfb[1]))); }
        writer.close();
    }
}
