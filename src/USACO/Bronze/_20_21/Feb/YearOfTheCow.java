package USACO.Bronze._20_21.Feb;

import java.util.*;
import java.io.*;

public class YearOfTheCow {
    static String[] animals = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};

    public static void main(String[] args) throws FileNotFoundException {
        for (int rep = 1; rep < 11; rep++) {
            long startTime = System.currentTimeMillis();
            Scanner sc = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob1_bronze_feb21/" + rep + ".in"));
            Scanner checkAns = new Scanner(new File("src/USACO/Bronze/_20_21/Feb/prob1_bronze_feb21/" + rep + ".out"));
            HashMap<String, Integer> when_born = new HashMap<>();
            when_born.put("Bessie", 2021);
            int N = sc.nextInt();
            sc.nextLine();
            for (int i=0; i<N; i++) {
                String cowa = sc.next();
                sc.next();
                sc.next();
                String relation = sc.next();
                String animal = sc.next();
                sc.next();
                sc.next();
                String cowb = sc.next();
                sc.nextLine();
                when_born.put(cowa, when_born.get(cowb));
                while(!get_animal(when_born.get(cowa)).equals(animal)) {
                    if (relation.equals("previous")) when_born.put(cowa, when_born.get(cowa)-1);
                    else when_born.put(cowa, when_born.get(cowa)+1);
                }
            }
            int diff = when_born.get("Bessie") - when_born.get("Elsie");
            if (diff < 0) diff = -diff;
            System.out.println(rep + ": " + diff);

            if (diff == checkAns.nextInt()) System.out.println("CORRECT - " + (System.currentTimeMillis() - startTime) + "ms \n");
            else System.out.println("WRONG\n");
        }
    }
    public static String get_animal(int year) {
        int a = 0, y = 2021;
        while (y < year) { y++; a++; if (a == 12) a = 0; }
        while (y > year) { y--; a--; if (a == -1) a = 11; }
        return animals[a];
    }
}