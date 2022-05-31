package leetcode.easy;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        int last = -1;
        for (int i : timeSeries) {
            count += duration;
            if (i <= last) count -= last - i + 1;
            last = i + duration - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        TeemoAttacking ta = new TeemoAttacking();
        int[] timeSeries = {1, 2};
        int duration = 2;
        System.out.println(ta.findPoisonedDuration(timeSeries, duration));
    }
}
