package leetcode.medium;
import java.util.*;
import java.util.stream.Collectors;

public class FilterRestaurants1333 {
    public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        HashMap<Integer, Integer> ratings = new HashMap<>();
        for (int[] i : restaurants) {
            if (i[3] <= maxPrice && i[4] <= maxDistance && !(veganFriendly == 1 && i[2] == 0)) {
                ratings.put(i[0], i[1]);
            }
        }
        return ratings.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey) // Extract the keys
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        int[][] r = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        System.out.println(filterRestaurants(r, 1, 50, 10));
    }
}
