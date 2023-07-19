package leetcode.medium;

import java.util.Arrays;
import java.util.Collections;

public class CompareStringsByFrequencyOfTheSmallestCharacter1170 {
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] q = new int[queries.length], ans = new int[queries.length];
        Integer[] w = new Integer[words.length];
        for (int i = 0; i < queries.length; i++) {
            char letter = 'z';
            int count = 0;
            for (char j : queries[i].toCharArray()) {
                if (j < letter) {
                    letter = j;
                    count = 1;
                } else if (j == letter) count++;
            }
            q[i] = count;
        }
        for (int i = 0; i < words.length; i++) {
            char letter = 'z';
            int count = 0;
            for (char j : words[i].toCharArray()) {
                if (j < letter) {
                    letter = j;
                    count = 1;
                } else if (j == letter) count++;
            }
            w[i] = count;
        }
        Arrays.sort(w, Collections.reverseOrder());
        for (int i = 0; i < q.length; i++) {
            int c = 0;
            for (int j : w) {
                if (q[i] < j) c++;
                else break;
            }
            ans[i] = c;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] queries = {"bbb","cc"}, words = {"a","aa","aaa","aaaa"};
        System.out.println(Arrays.toString(numSmallerByFrequency(queries, words)));
    }
}
