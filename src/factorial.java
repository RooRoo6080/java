import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long factorial = fact(number);
        System.out.println(factorial);
    }
    static long fact(long n) {
        if(n==1){
            return 1;
        }
        return fact(n-1)* n;
    }
}