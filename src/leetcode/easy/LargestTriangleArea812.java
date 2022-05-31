package leetcode.easy;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LargestTriangleArea812 {
    public static double largestTriangleArea(int[][] points) {
        double[] ll = {0, 0, 0};
        for (int[] i : points) {
            for (int[] j : points) {
                double l = sqrt(pow(i[0]-j[0], 2) + pow(i[1]-j[1], 2));
                if (l > ll[0]) {
                    ll[2] = ll[1];
                    ll[1] = ll[0];
                    ll[0] = l;
                } else if (l > ll[1]) {
                    ll[2] = ll[1];
                    ll[1] = l;
                } else if (l > ll[2]) { ll[2] = l;}
            }
        }
        double hp = (ll[0] + ll[1] + ll[2]) / 2;
        return (hp * (hp - ll[0]) * (hp - ll[1]) * (hp - ll[2]));
    }

    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points));
    }
}
