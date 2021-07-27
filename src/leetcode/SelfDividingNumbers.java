package leetcode;
// #728
import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for (int i = left, j; i <= right; i++) {
            for (j = i; j > 0; j /= 10)
                if (j % 10 == 0 || i % (j % 10) != 0) break;
            if (j == 0) nums.add(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        SelfDividingNumbers sdn = new SelfDividingNumbers();
        System.out.println(sdn.selfDividingNumbers(21, 213));
    }
}