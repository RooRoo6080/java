package leetcode.easy;

public class AddDigits {
    public int addDigits(int num) {
        int count = 0;
        while (num > 0) {
            count += num % 10;
            num /= 10;
        }
        if (String.valueOf(count).length() == 1) return count;
        return addDigits(count);
    }

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(0));
    }
}
