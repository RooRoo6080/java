package leetcode.easy;
// #744
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char i : letters)
            if (i > target) return i;
        return letters[0];
    }

    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget fslgtt = new FindSmallestLetterGreaterThanTarget();
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(fslgtt.nextGreatestLetter(letters, target));
    }
}
