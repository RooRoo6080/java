package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> generate(int rowIndex) {
        rowIndex ++;
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex - 1);
    }

    public static void main(String[] args) {
        PascalsTriangle2 pt = new PascalsTriangle2();
        System.out.println(pt.generate(3));
    }
}
