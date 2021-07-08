package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String append;
            if (i % 15 == 0) append = "FizzBuzz";
            else if (i % 5 == 0) append = "Buzz";
            else if (i % 3 == 0) append = "Fizz";
            else append = String.valueOf(i);
            ans.add(append);
        }
        return ans;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(243));
    }
}
