package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) return new int[0];
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n * m];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum=i + j;
                if(!map.containsKey(sum)) map.put(sum, new ArrayList<>());
                map.get(sum).add(mat[i][j]);
            }
        }
        int c = 0;
        for(HashMap.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> temp_list;
            if(entry.getKey() % 2 == 0) {
                temp_list = entry.getValue();
                Collections.reverse(temp_list);
            }
            else temp_list = entry.getValue();
            for (Integer integer : temp_list) arr[c++] = integer;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
