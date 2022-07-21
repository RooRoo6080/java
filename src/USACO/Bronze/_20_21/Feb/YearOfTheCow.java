package USACO.Bronze._20_21.Feb;

import java.util.*;
import java.io.*;

public class YearOfTheCow {
    static String[] animals = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};

    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob1_bronze_feb21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob1_bronze_feb21/" + rep + ".out"));
            HashMap<String, Integer> whenBorn = new HashMap<>();
            whenBorn.put("Bessie", 0);
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                String cowA = scanner.next();
                scanner.next();
                scanner.next();
                String relation = scanner.next();
                String animal = scanner.next();
                scanner.next();
                scanner.next();
                String cowB = scanner.next();
                scanner.nextLine();
                whenBorn.put(cowA, whenBorn.get(cowB));
                while(!getAnimal(whenBorn.get(cowA)).equals(animal)) {
                    if (relation.equals("previous")) whenBorn.put(cowA, whenBorn.get(cowA) - 1);
                    else whenBorn.put(cowA, whenBorn.get(cowA) + 1);
                }
            }
            int diff = whenBorn.get("Bessie") - whenBorn.get("Elsie");
            if (diff < 0) diff = -diff;
            System.out.println(rep + ": " + diff);

            if (diff == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
    public static String getAnimal(int year) {
        int a = 0, y = 0;
        while (y < year) { y++; a++; if (a == 12) a = 0; }
        while (y > year) { y--; a--; if (a == -1) a = 11; }
        return animals[a];
    }
}