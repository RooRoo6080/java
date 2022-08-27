package USACO.Bronze._18_19.Dec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BackAndForth {
    public static ArrayList<Integer> b1;
    public static ArrayList<Integer> b2;
    public static int milk;
    public static HashSet<Integer> quantities;

    public static void go(int day) {
        if (day == 4) {
            quantities.add(milk);
            return;
        }
        if (day % 2 == 0) {
            for (int i = 0; i < b1.size(); i++) {
                milk -= b1.get(i);
                int tmp = b1.remove(i);
                b2.add(tmp);
                go(day+1);
                tmp = b2.remove(b2.size()-1);
                b1.add(i,tmp);
                milk += b1.get(i);
            }
        }
        else {
            for (int i = 0; i < b2.size(); i++) {
                milk += b2.get(i);
                int tmp = b2.remove(i);
                b1.add(tmp);
                go(day+1);
                tmp = b1.remove(b1.size()-1);
                b2.add(i,tmp);
                milk -= b2.get(i);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            String path = "src/USACO/Bronze/_18_19/Dec/backforth_bronze_dec18/";
            Scanner scanner = new Scanner(new File(path + rep + ".in"));
            Scanner checkAns = new Scanner(new File(path + rep + ".out"));

            quantities = new HashSet<>();

            b1 = new ArrayList<>();
            b2 = new ArrayList<>();
            for (int i = 0; i < 10; i++) b1.add(scanner.nextInt());
            for (int i = 0; i < 10; i++) b2.add(scanner.nextInt());
            milk = 1000;

            go(0);

            int count = quantities.size();
            System.out.println(quantities.size());

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
