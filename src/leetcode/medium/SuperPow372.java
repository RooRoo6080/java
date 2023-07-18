package leetcode.medium;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SuperPow372 {
    public int superPow(int a, int[] b) {
        BigInteger c = new BigInteger(String.valueOf(a)), d = new BigInteger(String.valueOf(Integer.parseInt(Arrays.stream(b)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())))), e = new BigInteger(String.valueOf(1337));
        return Integer.parseInt(c.modPow(d, e).toString());
    }
}
