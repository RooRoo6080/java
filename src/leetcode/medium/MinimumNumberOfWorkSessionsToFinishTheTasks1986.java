package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberOfWorkSessionsToFinishTheTasks1986 {
//    Wrong Answer 81/96
//    public static int minSessions(int[] tasks, int sessionTime) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i : tasks) arr.add(i);
//        Collections.sort(arr);
//        int c = 0, total = 0;
//        while (arr.size() > 0) {
//            if (arr.get(arr.size() - 1) + c <= sessionTime) c += arr.remove(arr.size() - 1);
//            if (arr.size() > 0 && arr.get(0) + c <= sessionTime) c += arr.remove(0);
//            else {
//                total++;
//                c = 0;
//            }
//        }
//        if (c > 0) total++;
//        return total;
//    }
    public static int minSessions(int[] tasks, int sessionTime) {
        for (int n = 1; n < tasks.length; n++) {
            int[] remain = new int[n];
            Arrays.fill(remain, sessionTime);
            if (canWork(tasks, 0, remain)) return n;
        }
        return tasks.length;
    }

    public static boolean canWork(int[] tasks, int curr, int[] remain) {
        if (curr == tasks.length) return true;
        for (int i = 0; i < remain.length; i++) {
            if (i > curr) continue;
            if (remain[i] >= tasks[curr]) {
                remain[i] -= tasks[curr];
                if (canWork(tasks, curr + 1, remain)) return true;
                remain[i] += tasks[curr];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,5};
        System.out.println(minSessions(a, 7));
    }
}
