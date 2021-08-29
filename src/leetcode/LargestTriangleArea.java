package leetcode;

import java.util.Arrays;

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int[] a = null, b = null, c = null;
        for (int[] i : points) {
            if (a == null || i[0] > a[0] && i != b && i != c) a = i;
            if (b == null || i[1] > b[1] && i != a && i != c) b = i;
            if (c == null || i[0] < c[0] || i[1] < c[1] && i != b && i != a) c = i;
        }
        assert a != null;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        return (float)(a[0]*(b[1]-c[1])+b[0]*(c[1]-a[1])+c[0]*(a[1]-b[1])) / 2;
    }

    public static void main(String[] args) {
        LargestTriangleArea lta = new LargestTriangleArea();
        int[][] points = {{10,7},{0,4},{5,7}};
        System.out.println(lta.largestTriangleArea(points));
    }
}
