package USACO.Bronze._21_22.Feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SleepingInClass {
    /* v1 - NOT WORKING
    public static int highest(ArrayList<Integer> s) {
        int largest = 0;
        for (int i : s) if (i > largest) largest = i;
        return largest;
    }

    public static boolean equal (ArrayList<Integer> s) {
        int e = s.get(0);
        for (int i : s) if (i != e) return false;
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        for (int r = 1; r < 12; r++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob1_bronze_feb22/" + r + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob1_bronze_feb22/" + r + ".out"));
            int t = scanner.nextInt(), c = 0;
            System.out.println("--" + r + "--");
            for (int q = 0; q < t; q++) {
                int n = scanner.nextInt(), count = 0;
                ArrayList<Integer> s = new ArrayList<>();
                while (n-- > 0) s.add(scanner.nextInt());
                int h = highest(s);
                while (!equal(s)) {
                    for (int i = 0; i < s.size(); i++) {
                        if (s.get(i) < h) {
                            count++;
                            if (i == 0) {
                                s.set(i, s.get(i) + s.get(i + 1));
                                s.remove(i + 1);
                            }
                            else if (i == s.size() - 1) {
                                s.set(i, s.get(i) + s.get(i - 1));
                                s.remove(i - 1);
                            }
                            else if (s.get(i - 1) < s.get(i + 1)) {
                                s.set(i, s.get(i) + s.get(i - 1));
                                s.remove(i - 1);
                            }
                            else {
                                s.set(i, s.get(i) + s.get(i + 1));
                                s.remove(i + 1);
                            }
                        }
                    }
                    h = highest(s);
                }
                int ans = checkAns.nextInt();
                if (count == ans) {
                    c++;
                    System.out.println(count);
                }
                else System.out.println(count + " -> " + ans);

            }
            if (c == t) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG - " + c + "/" + t  + "\n");
        }
    }
     */

    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 12; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob1_bronze_feb22/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_21_22/Feb/prob1_bronze_feb22/" + rep + ".out"));
            int t = scanner.nextInt(), c = 0;
            System.out.println("--" + rep + "--");
            for (int q = 0; q < t; q++) {
                int n = scanner.nextInt();
                int[] a = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                    sum += a[i];
                }
                for (int r = n; r >= 1; r--) {
                    if (sum % r == 0) {
                        int target = sum / r;
                        int curr = 0;
                        boolean br = true;
                        for (int i = 0; i < n; i++) {
                            curr += a[i];
                            if (curr > target) {
                                br = false;
                                break;
                            }
                            if (curr == target) {
                                curr = 0;
                            }
                        }
                        if (br) {
                            System.out.println(n - r);
                            if (n - r == checkAns.nextInt()) c++;
                            break;
                        }
                    }
                }
            }
            if (c == t) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG - " + c + "/" + t  + "\n");
        }
    }
}
