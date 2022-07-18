package USACO.Bronze._20_21.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenMoreOddPhotos {
    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Jan/prob2_bronze_jan21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Jan/prob2_bronze_jan21/" + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            ArrayList<Integer> cows = new ArrayList<>();
            for (int i = 0; i < n; i++) cows.add(scanner.nextInt());
            boolean even = true;
            while (cows.size() > 0) {
                boolean completed = false;
                for (int i = 0; i < cows.size(); i++) {
                    if ((cows.get(i) % 2 == 0) == even) {
                        cows.remove(cows.get(i));
                        completed = true;
                        break;
                    }
                }
                if ((cows.size() == 1 && (cows.get(0) % 2 == 0) != even) || (!even && !completed)) break;
                if (even && !completed) {
                    cows.remove(cows.get(0));
                    cows.remove(cows.get(0));
                }
                even = !even;
                count++;
            }
            System.out.println(count);
            if (count == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
}
