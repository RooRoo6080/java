package leetcode.easy;

public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String i : s.split(" ")) {
            char[] word = i.toCharArray();
            int left = 0, right = word.length - 1;
            while (left < right) {
                char temp = word[left];
                word[left++] = word[right];
                word[right--] = temp;
            }
            sb.append(word);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInAString3 rwias3 = new ReverseWordsInAString3();
        System.out.println(rwias3.reverseWords("Let's take LeetCode contest"));
    }
}
