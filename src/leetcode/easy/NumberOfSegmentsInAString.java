package leetcode.easy;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s.trim().equals("")) return 0;
        return s.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInAString nosias = new NumberOfSegmentsInAString();
        System.out.println(nosias.countSegments(""));
    }
}
