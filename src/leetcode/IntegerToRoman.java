package leetcode;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String[][] all = {
                {"", "M", "MM", "MMM"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}
        };
        return all[0][num/1000] + all[1][(num%1000)/100] + all[2][(num%100)/10] + all[3][num%10];
    }

    public static void main(String[] args) {
        IntegerToRoman itr = new IntegerToRoman();
        System.out.println(itr.intToRoman(625));
    }
}
