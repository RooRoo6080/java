package leetcode.competition;

public class question1_250 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        boolean brk = false;
        String[] split = text.split(" ");
        for (String i : split) {
            brk = false;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (i.contains(Character.toString(brokenLetters.charAt(j)))) brk = true;
            }
            if (!brk) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        question1_250 q1250 = new question1_250();
        System.out.println(q1250.canBeTypedWords("hello world", "ad"));
    }
}
