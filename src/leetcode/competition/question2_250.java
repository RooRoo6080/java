//did not pass - tle on unprovided testcase
package leetcode.competition;

public class question2_250 {
    public int addRungs(int[] rungs, int dist) {
        int count = 0;
        int[] rungz = new int[rungs.length + 1];
        System.arraycopy(rungs, 0, rungz, 1, rungs.length);
        for (int i = 0; i < rungz.length - 1; i++) {
            if (rungz[i + 1] - rungz[i] > dist) {
                count++;
                rungz[i] = rungz[i] += dist;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        question2_250 q2250 = new question2_250();
        int[] rungs = {3};
        System.out.println(q2250.addRungs(rungs, 1));
    }
}
