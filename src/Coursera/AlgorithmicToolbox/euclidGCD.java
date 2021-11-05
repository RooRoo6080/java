package Coursera.AlgorithmicToolbox;

public class euclidGCD {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }

    public static void main(String[] args) {
        euclidGCD egcd = new euclidGCD();
        System.out.println(egcd.gcd(357, 234));
    }
}
