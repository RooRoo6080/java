package leetcode.medium;

import java.util.Arrays;
import java.util.Collections;

public class ConstructStringWithRepeatLimit2182 {
    public static String repeatLimitedString(String s, int repeatLimit) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        int n = a.length;
        char t;
        for (int i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        int c = 1;
        char last = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == last) c++;
            else {
                c = 1;
                last = a[i];
            }
            if (c == repeatLimit) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] != last) {
                        a[i] = a[j];
                        a[j] = last;
                        c = 1;
                        last = a[i];
                        break;
                    }
                    a[i] = ' ';
                }
            }
        }
        return new String(a).replaceAll(" ", "");
    }

    public static void main(String[] args) {
        String s = "aababab";
        int repeatLimit = 2;
        System.out.println(repeatLimitedString(s, repeatLimit));
    }
}
