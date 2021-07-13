package leetcode;

import java.util.Arrays;

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i * i <= area; i++) {
            int secondNum = area / i;
            if (area % i == 0 && secondNum - i < diff) {
                diff = secondNum - i;
                ans[1] = i;
                ans[0] = secondNum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ConstructTheRectangle ctr = new ConstructTheRectangle();
        System.out.println(Arrays.toString(ctr.constructRectangle(37)));
    }

}
