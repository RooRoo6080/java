package leetcode;

public class Base7 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        Base7 b7 = new Base7();
        System.out.println(b7.convertToBase7(5134));
    }
}
