package CodeForces._1100;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Laptops456a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int laptops = scanner.nextInt();
        TreeMap<Integer, Integer> pq = new TreeMap<>();
        TreeMap<Integer, Integer> b = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < laptops; i++) pq.put(scanner.nextInt(), scanner.nextInt());
        b.putAll(pq);
        for(Map.Entry<Integer,Integer> low : pq.entrySet()) {
            Integer price = low.getKey();
            for(Map.Entry<Integer,Integer> high : b.entrySet()) {
                Integer hPrice = high.getKey();
                if (hPrice > price) {
                    if (low.getValue() > high.getValue()) {
                        System.out.println("Happy Alex");
                        return;
                    }
                } else break;
            }
        }
        System.out.println("Poor Alex");
    }
}
