package leetcode.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum2208 {
    public static int halveArray(int[] nums) {
        double sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            pq.add((double) i);
            sum += i;
        }
        double half = sum;
        int count = 0;
        while (half > sum / 2) {
            double i = pq.poll();
            i /= 2;
            half -= i;
            pq.add(i);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,8,20};
        System.out.println(halveArray(nums));
    }
}
