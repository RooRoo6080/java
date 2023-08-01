package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheJumbledNumbers2191 {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> l = new ArrayList<>();
        for (int i : nums) {
            String s = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            for (char j : s.toCharArray()) sb.append(mapping[j - '0']);
            l.add(new int[]{Integer.parseInt(sb.toString()), i});
        }
        l.sort(Comparator.comparingInt(a -> a[0]));
        int[] ans = new int[nums.length];
        int c = 0;
        for(int[] arr : l) ans[c++] = arr[1];
        return ans;
    }

    public static void main(String[] args) {
        int[] map = {8,9,4,0,2,1,3,5,7,6};
        int[] n = {991,338,38};
        System.out.println(Arrays.toString(sortJumbled(map, n)));
    }
}
