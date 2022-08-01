package USACO.Bronze._19_20.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LivestockLineup {
    public static boolean nextPermutation(ArrayList<String> arr) {
        int last = arr.size() - 2;
        while (last >= 0 && arr.get(last).compareTo(arr.get(last + 1)) >= 0) last--;
        if (last < 0) return false;
        int next = arr.size() - 1;
        while (arr.get(next).compareTo(arr.get(last)) <= 0) next--;
        Collections.swap(arr, last, next);
        Collections.reverse(arr.subList(last + 1, arr.size()));
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_19_20/Dec/lineup_bronze_dec19/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_19_20/Dec/lineup_bronze_dec19/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            ArrayList<String> cows = new ArrayList<>();
            cows.add("Beatrice");
            cows.add("Belinda");
            cows.add("Bella");
            cows.add("Bessie");
            cows.add("Betsy");
            cows.add("Blue");
            cows.add("Buttercup");
            cows.add("Sue");
            ArrayList<String> beside_a = new ArrayList<>();
            ArrayList<String> beside_b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                beside_a.add(scanner.next());
                scanner.next();
                scanner.next();
                scanner.next();
                scanner.next();
                beside_b.add(scanner.next());
            }
            while (nextPermutation(cows)) {
                boolean satisfied = true;
                for (int i = 0; i < n; i++) {
                    if (Math.abs(cows.indexOf(beside_a.get(i)) - cows.indexOf(beside_b.get(i))) != 1) {
                        satisfied = false;
                        break;
                    }
                }
                if (satisfied) {
                    for (int i = 0; i < 8; i++) {
                        System.out.println(cows.get(i));
                        if (cows.get(i).equals(checkAns.next())) count++;
                    }
                    break;
                }
            }

            if (count == 8) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
