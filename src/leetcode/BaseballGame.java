package leetcode;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> record = new Stack<>();
        for(String op : ops) {
            switch (op) {
                case "+" -> {
                    int top = record.pop();
                    int newtop = top + record.peek();
                    record.push(top);
                    record.push(newtop);
                }
                case "C" -> record.pop();
                case "D" -> record.push(2 * record.peek());
                default -> record.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        for(int score : record) ans += score;
        return ans;
    }

    public static void main(String[] args) {
        BaseballGame bg = new BaseballGame();
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(bg.calPoints(ops));
    }
}
