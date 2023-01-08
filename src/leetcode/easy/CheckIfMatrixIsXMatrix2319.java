package leetcode.easy;

import java.util.Arrays;

public class CheckIfMatrixIsXMatrix2319 {
    public static boolean checkXMatrix(int[][] grid) {
        int n = grid[0].length;
        int left = 0, right = n - 1;
        for (int[] i : grid) {
            for (int j = 0; j < n; j++) {
                if (j == left || j == right) {
                    if (i[j] == 0) return false;
                } else if (i[j] != 0) return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println(checkXMatrix(grid));
    }
}
