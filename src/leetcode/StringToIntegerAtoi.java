package leetcode;

public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int index = 0, sign = 1;
        if(s.length() == 0) return 0;

        while(index < s.length() && s.charAt(index) == ' ')
            index++;

        if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        if(index < s.length() && !Character.isDigit(s.charAt(index))) return 0;

        int result = 0;
        while(index < s.length()) {
            if(!Character.isDigit(s.charAt(index))) break;
            char current = s.charAt(index++);
            int previous = result;
            result *= 10;
            if(previous != result / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result += (current - '0');
            if(result < 0) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return result * sign;
    }

    public static void main(String[] args) {
        StringToIntegerAtoi stia = new StringToIntegerAtoi();
        System.out.println(stia.myAtoi("42"));
    }
}
