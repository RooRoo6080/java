package Coursera.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class dynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        dynamicArray.add(5);
        dynamicArray.add(4);
        dynamicArray.add(8);
        dynamicArray.add(2);
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.get(3));
        dynamicArray.remove(3);
        System.out.println(dynamicArray);
        Integer[] staticArray = dynamicArray.toArray(Integer[]::new);
        System.out.println(Arrays.toString(staticArray));
    }
}
