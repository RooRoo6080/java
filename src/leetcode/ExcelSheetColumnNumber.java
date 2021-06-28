package leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum *= 26;
            sum += columnTitle.charAt(i) - 64;
        }
        return sum;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
        System.out.println(escn.titleToNumber("A"));
    }
}
