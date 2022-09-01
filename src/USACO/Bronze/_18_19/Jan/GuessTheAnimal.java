package USACO.Bronze._18_19.Jan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GuessTheAnimal {
    /* v1 - works, but TLE on t3 onwards
    public static HashMap<String, Integer> common(String[][] sets) {
        HashMap<String, Integer> characteristics = new HashMap<>();
        for (String[] set : sets) {
            if (set[0].equals("null")) continue;
            for (int j = 2; j < Integer.parseInt(set[1]) + 1; j++) {
                if (!characteristics.containsKey(set[j])) characteristics.put(set[j], 1);
                else characteristics.put(set[j], characteristics.get(set[j]) + 1);
            }
        }
        return characteristics;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 3; rep < 4; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Jan/guess_bronze_jan19/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count = 1;
            scanner.nextLine();
            String[][] sets = new String[n][];
            for (int i = 0; i < n; i++) sets[i] = scanner.nextLine().split(" ");
            while (n > 1) {
                HashMap<String, Integer> characteristics = common(sets);
                String rem = "";
                int maxValueInMap = (Collections.max(characteristics.values()));
                for (Map.Entry<String, Integer> entry : characteristics.entrySet()) {
                    if (entry.getValue() == maxValueInMap) rem = entry.getKey();
                }
                for (String[] set : sets) {
                    if (!Arrays.toString(set).contains(rem)) {
                        Arrays.fill(set, "null");
                        n--;
                    }
                }
                count++;
            }

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(c + "/" + 10);
    }
     */

    // v2 - better brute force logic
    public static int similar(String[] a, String[] b) {
        int count = 1;
        for (int i = 2; i < a.length; i++) {
            for (int j = 2; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Jan/guess_bronze_jan19/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));
            int n = scanner.nextInt(), count = 0;
            scanner.nextLine();
            String[][] sets = new String[n][];
            for (int i = 0; i < n; i++) sets[i] = scanner.nextLine().split(" ");
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    count = Math.max(count, similar(sets[i], sets[j]));
                }
            }

            System.out.println(rep + ": " + count);
            if (count == checkAns.nextInt()) {
                System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
                c++;
            }
            else System.out.println("WRONG\n");
        }
        System.out.println(c + "/" + 10);
    }
}
