package leetcode.medium;

public class MinimumOperationsToMakeASpecialNumber2844 {
    public static int minimumOperations(String num) {
        int n = num.length(), remove = num.length();
        if (n == 2 && num.charAt(1) == '0' && num.charAt(0) != '5') return 1;
        if (n >= 2) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (Integer.parseInt(num.charAt(i) + "" + num.charAt(j)) % 25 == 0) {
                        int temp = (n - j) + (j - i) - 2;
                        if (temp < remove) {
                            remove = temp;
                        }
                    }
                }
            }
        }
        if (remove == n && num.contains("0")) return n - 1;
        return remove;
    }

    public static void main(String[] args) {
        String number = "820366";
        System.out.println(minimumOperations(number));
    }
}
