package leetcode.easy;
//796
public class RotateString {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < s.length(); i++) {
            char first = sb.charAt(s.length() - 1);
            sb.deleteCharAt(s.length() - 1);
            sb.insert(0, first);
            if (sb.toString().equals(goal)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RotateString rs = new RotateString();
        System.out.println(rs.rotateString("abcde", "cdeab"));
    }
}
