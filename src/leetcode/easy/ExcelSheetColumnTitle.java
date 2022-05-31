//not my code

package leetcode.easy;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle escs = new ExcelSheetColumnTitle();
        System.out.println(escs.convertToTitle(1000));
    }
}
