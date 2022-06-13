package CodeForces._1000;

import java.util.Scanner;

public class ChatRoom58a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans = "NO";
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hello[index]) index++;
            if (index == 5) {
               ans = "YES";
               break;
            }
        }
        System.out.println(ans);
    }
}