package USACO.Bronze._17_18.Feb;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TamingTheHerd {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(new File("taming.in"));
        Scanner scanner = new Scanner(System.in);
        //FileWriter writer = new FileWriter("taming.out");
        int n = scanner.nextInt();
        int[] log = new int[n];
        boolean s = true;
        for (int i = 0; i < n; i++) log[i] = scanner.nextInt();
        if (log[0] > 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 1; i < n; i++) {
            if (log[i] != -1) {
                int c = log[i] - 1;
                for (int j = i - 1; j >= i - log[i]; j--) {
                    if (j >= 0  && (log[j] == c || log[j] == -1)) log[j] = c--;
                    else {
                        s = false;
                        break;
                    }
                }
            }
            if (!s) {
                System.out.println(-1);
                return;
            }
        }
        int c0 = 0, c1 = 0;
        for (int i = 1; i < n; i++) {
            if (log[i] == 0) c0++;
            else if (log[i] == -1) c1++;
        }
        if (log[0] == -1 || log[0] == 0) c0++;

        System.out.println(c0 + " " + (c1 + c0));
        //writer.write(String.valueOf(1));
        //writer.close();
    }
}
