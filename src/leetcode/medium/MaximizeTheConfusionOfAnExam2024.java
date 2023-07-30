package leetcode.medium;

public class MaximizeTheConfusionOfAnExam2024 {
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int t = 0, f = 0, max = 0, left = 0, right = 0;
        while (right < answerKey.length()) {
            if (answerKey.charAt(right) == 'T') t++;
            else f++;
            if (t > k && f > k) {
                if (answerKey.charAt(left) == 'T') t--;
                else f--;
                left++;
            }
            right++;
            max = Math.max(max, right - left);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "TTFTTFTT";
        int k = 1;
        System.out.println(maxConsecutiveAnswers(s, k));
    }
}
