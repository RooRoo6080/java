package leetcode.medium;

public class MaximizeDistanceToClosestPerson849 {
    public static int maxDistToClosest(int[] seats) {
        int max = 0, c = 0;
        boolean oneAppeared = false;
        for (int seat : seats) {
            if (seat == 1) {
                if (!oneAppeared) max = Math.max(max, c);
                max = Math.max(max, (c + 1) / 2);
                c = 0;
                oneAppeared = true;
            } else c++;
        }
        max = Math.max(max, c);
        return max;
    }

    public static void main(String[] args) {
        int[] n = {0,1};
        System.out.println(maxDistToClosest(n));
    }
}
