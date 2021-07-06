package leetcode;

public class ReverseVowels {
    public String reverseVowels(String s) {
        if(s == null || s.length()==0) return s;
        int left = 0, right = s.length() - 1;
        String vowels = "AEIOUaeiou";
        char[] array = s.toCharArray();
        while (left < right) {
            while (left < right && !vowels.contains(array[left] + "")) left++;
            while (left < right && !vowels.contains(array[right] + "")) right--;
            array[left] = array[right];
            array[right--] = s.charAt(left++);
        }
        return new String(array);
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("hello"));
    }
}
