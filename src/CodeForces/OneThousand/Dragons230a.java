package CodeForces.OneThousand;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons230a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strength = scanner.nextInt();
        int n = scanner.nextInt();
        String result = "YES";
        TreeMap<Integer, Integer> dragons = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int health = scanner.nextInt();
            int plus = scanner.nextInt();
            if (!dragons.containsKey(health)) dragons.put(health, plus);
            else dragons.put(health, dragons.get(health) + plus);
        }
        for (Map.Entry<Integer, Integer> entry : dragons.entrySet()) {
            if (entry.getKey() < strength) strength += entry.getValue();
            else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
