package leetcode;
import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        HashMap<String, Integer> dict = new HashMap<>() {{
            put("I", 1); put("V", 5); put("X", 10); put("L", 50); put("C", 100); put("D", 500); put("M", 1000);
        }};

        int count = 0;
        int lastIndex = 0;

        for (int i=0; i<s.length(); i++) {
            int getI = dict.get(Character.toString(s.charAt(i)));
            int getLastIndex = dict.get(Character.toString(s.charAt(lastIndex)));
            if (getI > getLastIndex) {
                count += getI-getLastIndex*2;
            } else {
                count += getI;
            }
            lastIndex = i;
        }
        return count;
    }

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        String str = "XIX";
        System.out.println(rti.romanToInt(str));
    }
}
