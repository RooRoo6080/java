package USACO.Bronze._19_20.USopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class CowntactTracing {

    // converted from C++ solution
    // 7/16
    // bug undiscovered

    static boolean[] Infected = new boolean[101];
    static int N;
    static int[] cowX = new int[251], cowY = new int[251];

    public static boolean consistent(int starter, int K) {
        boolean[] infected = new boolean[101];
        int[] handshakes = new int[101];
        infected[starter] = true;
        for (int t = 0; t <= 250; t++) {
            int x = cowX[t], y = cowY[t];
            if (x > 0) {
                if (infected[x]) handshakes[x]++;
                if (infected[y]) handshakes[y]++;
                if (handshakes[x] <= K && infected[x]) infected[y] = true;
                if (handshakes[y] <= K && infected[y]) infected[x] = true;
            }
        }
        for (int i = 1; i <= N; i++)
            if (infected[i] != Infected[i]) return false;
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        for (int rep = 1; rep < 17; rep++) {
            System.out.println("-- " + rep + " --");
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_19_20/USopen/tracing_bronze_open20/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            N = scanner.nextInt();
            int T = scanner.nextInt();
            String s = scanner.next();
            for (int i = 1; i <= N; i++)
                Infected[i] = s.charAt(i - 1) == '1';
            for (int i = 0; i < T; i++) {
                int t = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                cowX[t] = x;
                cowY[t] = y;
            }

            boolean[] possibleI = new boolean[101];
            boolean[] possibleK = new boolean[252];
            for (int i = 1; i <= N; i++) {
                for (int k = 0; k <= 251; k++) {
                    if (consistent(i, k)) {
                        possibleI[i] = true;
                        possibleK[k] = true;
                    }
                }
            }

            int lowerK = 251, upperK = 0, starter = 0;
            for (int i = 0; i <= 251; i++) if (possibleK[i]) upperK = i;
            for (int i = 251; i >= 0; i--) if (possibleK[i]) lowerK = i;
            for (int i = 1; i <= N; i++) if (possibleI[i]) starter++;

            System.out.print(starter + " " + lowerK + " ");
            if (upperK == 251) System.out.println("Infinity");
            else System.out.println(upperK);

            int c = 0;
            if (starter == checkAns.nextInt()) c++;
            if (lowerK == checkAns.nextInt()) c++;
            String lastCheck = checkAns.next();
            if (String.valueOf(upperK).equals(lastCheck) || (upperK == 251 && Objects.equals(lastCheck, "Infinity"))) c++;
            if (c == 3) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                count++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(count + "/" + 16);
    }
}
