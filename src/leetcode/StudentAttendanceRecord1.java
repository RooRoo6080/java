package leetcode;

public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        int absent = 0, late = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') absent++;
            if (s.charAt(i) == 'L') late++;
            else late = 0;
            if (absent == 2 || late == 3) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StudentAttendanceRecord1 sar1 = new StudentAttendanceRecord1();
        System.out.println(sar1.checkRecord("PAPAPALAALPLAPALAL"));
    }
}
