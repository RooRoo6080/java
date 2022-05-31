package leetcode.easy;
// #717
public class OneBitAndTwoBitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int ones = 0;
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0 ; i--) ones++;
        return ones % 2 == 0;
    }

    public static void main(String[] args) {
        OneBitAndTwoBitCharacters obatbc = new OneBitAndTwoBitCharacters();
        int[] bits = {0, 1, 0};
        System.out.println(obatbc.isOneBitCharacter(bits));
    }
}
