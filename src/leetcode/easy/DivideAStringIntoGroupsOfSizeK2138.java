package leetcode.easy;

import java.util.Arrays;

public class DivideAStringIntoGroupsOfSizeK2138 {
    public static String[] divideString(String s, int k, char fill) {
        int a = 0;
        if(s.length() % k != 0){
            a = k - s.length() % k;
        }
        s = s + String.valueOf(fill).repeat(Math.max(0, a));
        String[] out = new String[s.length()/k];
        int index = 0;
        for(int i = 0; i < s.length(); i += k){
            out[index] = s.substring(i, i + k);
            index++;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideString("bgycymgbblobvpdf", 67, 'n')));
    }
}
