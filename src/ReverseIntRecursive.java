public class ReverseIntRecursive {
    static int reverse(int n) {
        System.out.print(n % 10);
        return (n / 10 > 0) ? reverse(n/10) : 0;
    }

    public static void main(String[] args) {
        int n = 65242;
        reverse(n);
    }
}