package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length + list2.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j < list1.length && i - j < list2.length && list1[j].equals(list2[i - j])) list.add(list1[j]);
            }
            if (list.size() > 0) {
                break;
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists misotl = new MinimumIndexSumOfTwoLists();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println(Arrays.toString(misotl.findRestaurant(list1, list2)));
    }
}
