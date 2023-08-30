package leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountArtifactsThatCanBeExtracted2201 {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int[][] map = new int[n][n];
        int count = 0;
        for (int[] i : artifacts) {
            count++;
            map[i[0]][i[1]] = count;
            if (i[2] - i[0] == 1 && i[3] - i[1] == 1) map[i[0] + 1][i[1] + 1] = count;
            while (++i[0] < i[2]) map[i[0]][i[1]] = count;
            while (++i[1] < i[3]) map[i[0]][i[1]] = count;
            map[i[2]][i[3]] = count;
        }
        for (int[] i : map) System.out.println(Arrays.toString(i));
        for (int[] i : dig) map[i[0]][i[1]] = 0;
        Set<Integer> covered = new HashSet<>();
        for (int[] i : map) for (int j : i) if (j != 0) covered.add(j);
        for (int[] i : map) System.out.println(Arrays.toString(i));
        return count - covered.size();
    }

    public static void main(String[] args) {
        int[][] artifacts = {{4,5,5,5},{5,1,7,1},{1,8,3,8},{1,1,1,2},{0,5,3,5},{6,2,7,2},{7,5,7,6},{6,4,6,6},{2,7,5,7},{0,2,0,2},{7,7,8,8},{3,1,4,2},{2,3,3,3},{5,3,7,3},{8,4,8,4},{2,6,5,6},{8,1,8,2},{4,8,4,8},{1,0,4,0},{6,8,6,8},{1,3,1,4},{0,7,0,8},{0,3,0,4},{0,6,0,6}};
        int[][] dig = {{0,3},{0,4},{8,5},{8,6},{8,7},{0,8},{8,8},{0,6},{1,1},{1,8},{2,0},{2,2},{2,3},{2,4},{2,5},{2,8},{3,2},{3,3},{3,4},{3,5},{3,6},{3,7},{4,0},{4,3},{4,4},{4,6},{4,7},{5,1},{5,2},{5,6},{5,8},{6,0},{6,2},{6,4},{6,5},{6,6},{7,0},{7,1},{7,4},{7,5},{7,7}};
        System.out.println(digArtifacts(9, artifacts, dig));
    }
}
